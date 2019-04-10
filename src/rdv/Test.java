package rdv;

import java.io.FileNotFoundException;
import java.io.IOException;

import priserdv.XMLTools;

public class Test {
	
	
	public static void main (String[] args) throws FileNotFoundException, IOException{
        ListeRDV listeRdv= (ListeRDV) XMLTools.decodeToObject("rdv.xml");    
        
        RendezVous testRdv = new RendezVous("15/03/19","15","Michel Cymes","Paul Jaquit","Pneumonie");
        
        if (listeRdv.getListeRDV().contains(testRdv)) System.out.println("existe");
        




	}

}
