package priserdv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rdv.ListeRDV;

/**
 * Servlet implementation class ListRdvServlet
 */
@WebServlet("/ListRdvServlet")
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
			listeRdv.afficher();
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
