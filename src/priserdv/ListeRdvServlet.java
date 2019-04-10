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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml"); 
		
			if(request.getParameterMap().size()==3) {
			String date =request.getParameter("date");
			String heure =request.getParameter("heure");
			String med =request.getParameter("med");
		
			med= med.replace("_", " ");
			
			System.out.println(date+" "+heure+" "+med);
			
			
			   
			listeRdv.supprimer(date, heure, med);
			XMLTools.encodeToFile(listeRdv,"rdv.xml");
			}
			else
				System.out.println("pas de param");
			
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
