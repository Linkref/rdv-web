

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patient.*;
import rdv.*;

/**
 * Servlet implementation class RdvServlet
 */
@WebServlet("/RdvServlet")
public class RdvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RdvServlet() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		initData();
		
		ListePatient LP=getPatient();
		request.setAttribute( "patient", LP );
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request, response );
	}
	
	/**
	 * Initialise des données pour les patients et medecins
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void  initData() throws FileNotFoundException, IOException {
		
        ListePatient patients= new ListePatient();
    	
    	Patient pat1 = new Patient("toto","tata");
    	Patient pat2 = new Patient("titi","tete");
    	patients.add(pat1);
    	patients.add(pat2);        	
        
    	 
		XMLTools.encodeToFile(patients, "patient.xml");

	}
	
	
	
	private ListePatient getPatient() throws FileNotFoundException, IOException
	{
		 ListePatient l;
		l= (ListePatient)XMLTools.decodeToObject("patient.xml");	
		return l;
	
	}

}
