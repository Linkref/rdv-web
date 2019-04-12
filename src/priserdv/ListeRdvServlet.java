package priserdv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rdv.XMLTools;
import rdv.ListeRDV;

/**
 * Servlet implementation class ListRdvServlet
 */
@WebServlet()
public class ListeRdvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeRdvServlet() {

    }

	/**
	 * Charge tableau.jsp avec la liste des rendez-vous en paramètre
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml"); // Récupère la liste des RDV
		
		// Vérifie si les paramètres sont bien dans l'URL
		// Si il existe des paramètre c'est pour lancer la suppréssion d'un RDV
		if  (( request.getParameterMap().containsKey("med")) && (request.getParameterMap().containsKey("date")) && (request.getParameterMap().containsKey("heure"))){
			
			// Récupération des paramètres depuis l'URL
			String date =request.getParameter("date");
			String heure =request.getParameter("heure");
			String med =request.getParameter("med").replace("_", " ");
		
			listeRdv.supprimer(date, heure, med); // Suppréssion du RDV de la liste
			XMLTools.encodeToFile(listeRdv,"rdv.xml"); // Enregistrement du fichier mis à jour
		}
 
			
		request.setAttribute( "listeRdv", listeRdv );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/tableau.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
