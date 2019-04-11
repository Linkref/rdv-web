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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml");
		List<String> horaires = new ArrayList<String>();
		
		if  (( request.getParameterMap().containsKey("med")) && (request.getParameterMap().containsKey("date"))){
			
		String med =request.getParameter("med").replace("_", " ");
		String date =request.getParameter("date");

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
