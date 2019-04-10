package priserdv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patient.*;
import rdv.*;
import medecin.*;

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
		

		if (!new File("rdv.xml").exists())
			initData("rdv");
		
		if (!new File("patient.xml").exists())
			initData("patients");
		
		if (!new File("medecin.xml").exists())
			initData("medecins");
		
		ListePatient LP= getPatient();
		ListeMedecin LM= getMedecin();
		
		request.setAttribute( "medecins", LM );
		request.setAttribute( "patients", LP );
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	       /* R�cup�ration des champs du formulaire. */
        String specialite = request.getParameter( "selectSpe" );
        String medecin = request.getParameter( "selectMed" );
        String patient = request.getParameter( "selectPat" );
        String raison = request.getParameter( "raisonrdv" );
        String date = request.getParameter( "date" );
        String heure = request.getParameter( "Heure" );
        
		String[] str= patient.split(" ");
		Patient p = new Patient(str[0],str[1]);
		
		
		str=medecin.split(" ");
		Medecin m = new Medecin(str[0],str[1],specialite);
		
        RendezVous rdv = new RendezVous(date,heure,m,p,raison);

        ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml");    
        listeRdv.add(rdv);
        XMLTools.encodeToFile(listeRdv,"rdv.xml");
		
        response.sendRedirect("listerdv?form=ok");
	}
	
	/**
	 * Initialise des données pour les patients, les médecins et les rdv
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void  initData(String param) throws FileNotFoundException, IOException {
		
        ListePatient patients= new ListePatient();
    	Patient pat1 = new Patient("Dupont","Jean");
    	Patient pat2 = new Patient("Pierre","Martin");
    	patients.add(pat1);
    	patients.add(pat2);  
    	
        ListeMedecin medecins= new ListeMedecin();
    	Medecin med1 = new Medecin("Cymes","Michel","Généraliste");
    	Medecin med2 = new Medecin("House","Gregory","Généraliste");
    	Medecin med3 = new Medecin("Polo","Marco","Cardiologue");
    	medecins.add(med1);
    	medecins.add(med2);
    	medecins.add(med3);  
    	
    	ListeRDV l = new ListeRDV();
    	l.add(new RendezVous("12 Mars 2019","12:15",med1,pat1,"Maladie Pulmonaire"));
		
		if (param == "medecins")
			XMLTools.encodeToFile(medecins,"./medecin.xml");
		else if (param == "patients")
			XMLTools.encodeToFile(patients,"./patient.xml");
		else if (param == "rdv") 
	    	XMLTools.encodeToFile(l,"./rdv.xml");
		else 
			System.out.println("Error");





	}
	
	
	
	private ListePatient getPatient() throws FileNotFoundException, IOException
	{
		 ListePatient l;
		l= (ListePatient)XMLTools.decodeToObject("patient.xml");	
		return l;
	
	}
	
	private ListeMedecin getMedecin() throws FileNotFoundException, IOException
	{
		ListeMedecin l;
		l= (ListeMedecin)XMLTools.decodeToObject("medecin.xml");	
		return l;
	
	}

}
