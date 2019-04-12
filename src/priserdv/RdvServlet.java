package priserdv;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rdv.*;


/**
 * Servlet implementation class RdvServlet
 */
@WebServlet()
public class RdvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RdvServlet() {
        
    }

	/**
	 * Créer le fichier rdv.xml si il n'existe pas et envoie la liste des rendez-vous
	 * à index.jsp
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Si le fichier des rendez-vous n'existe pas on le crée avec une liste vide
		if (!new File("rdv.xml").exists()) {
	    	ListeRDV l = new ListeRDV();
			XMLTools.encodeToFile(l,"./rdv.xml");
		}
	    
		// Récupération des rendez-vous  puis envoie on charge index.jsp avec les rendez-vous en paramètre
		ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml"); 
		request.setAttribute( "listeRdv", listeRdv );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request, response );
	}

	/**
	 * On récupère les information du rende-vous et le rajoute dans rdv.xml
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	    // Récupération des champs du formulaire
        String medecin = request.getParameter( "selectMed" );
        String patientNom = request.getParameter( "patientNom" );
        String patientPrenom = request.getParameter( "patientPrenom" );
        String raison = request.getParameter( "raisonrdv" );
        String date = request.getParameter( "date" );
        String heure = request.getParameter( "heure" );
        
        //On remplace les espaces potentiel du nom et prénom
        patientNom=patientNom.replace(" ","_");       
        patientPrenom=patientPrenom.replace(" ", "_");
        
        //protection contre les injection de balise html
        patientPrenom=patientPrenom.replace("<", "");
        patientNom=patientNom.replace("<","");
        raison=raison.replace("<", "");
            
        //On recupère la liste des rendez-vous stocké dans rdv.xml
        RendezVous rdv = new RendezVous(date,heure,medecin,patientNom+" "+patientPrenom,raison);
        ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml");
        
        // Si le rendez-vous existe déjà, on ne l'ajoute pas et on déclenche un message d'erreur
        // Sinon on l'ajoute et on déclenche un message de succes
        if (listeRdv.getListeRDV().contains(rdv)) {
        	response.sendRedirect("index?form=ko");
        } else {        
	        listeRdv.add(rdv);   
	        XMLTools.encodeToFile(listeRdv,"rdv.xml");
	        response.sendRedirect("listerdv?form=ok");
        }
        
	}
	

}
