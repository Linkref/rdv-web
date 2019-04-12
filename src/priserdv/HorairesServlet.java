package priserdv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rdv.ListeRDV;
import rdv.RendezVous;
import rdv.XMLTools;

/**
 * Servlet implementation class Horaires
 */
@WebServlet("/Horaires")
public class HorairesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HorairesServlet() {
        super();
    }

	/**
	 * Charge horaires.jsp avec les horaires des rendez-vous d'un medecin
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml"); // Récupère la liste des rendez-vous
		List<String> horaires = new ArrayList<String>(); 
		
		// Vérifie si les paramètres sont bien présent dans l'URL
		if  (( request.getParameterMap().containsKey("med")) && (request.getParameterMap().containsKey("date"))){
			
			// Récupère les paramètres depuis l'URL
			String med =request.getParameter("med").replace("_", " "); 
			String date =request.getParameter("date");
	
			// Parcours de la liste des rendez-vous
			// Test si un rendez-vous existe pour un médecin donné à une date donnée
			for(RendezVous rdv : listeRdv.getListeRDV()) 
				if ((rdv.getMedecin().equals(med)) && (rdv.getDate().equals(date) )) 
					horaires.add(rdv.getHeureDebut());
	
		}
		
		request.setAttribute( "horaires", horaires );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/horaires.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
