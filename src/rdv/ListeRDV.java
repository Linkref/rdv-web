package rdv;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * Objet qui définit une liste de rendez-vous
 */

public class ListeRDV implements Serializable{
	
	/**
	 * Liste des rendez-vous
	 */
	private ArrayList<RendezVous> listeRDV;

	
	/**
	 * 	Constructeur
	 *  Initialise la liste
	 */
	public ListeRDV() {
		listeRDV = new ArrayList<RendezVous>();
	}
	
	
	/**
	 * Ajoute un rendez-vous à la liste
	 * @param rdv: rendez-vous
	 */
	public void add(RendezVous rdv)
	{
		this.listeRDV.add(rdv);
	}
	
	/**
	 * Supprime un rendez-vous de la liste
	 * @param date heure medecin
	 */
	public void supprimer(String date, String heure, String medecin)
	{
		RendezVous rdvSup = new RendezVous(date,heure,medecin,null,null);
		
		for(int i = 0; i < this.listeRDV.size();i++)
			if(listeRDV.get(i).equals(rdvSup))
				this.listeRDV.remove(listeRDV.get(i));	
	
	}
		
	/**
	 * Compte le nombre de rendez-vous selon la date du jour
	 * @param param: passe ajd futur
	 * @return nombre de rdv
	 */
	public int compterRdv(String param) throws ParseException {
		
		int cpt = 0;
	
		// Initialise et sérialise une date de manière à ce qu'elle puisse être comparée
	    Date date = new Date();
	    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	    String today = formatter.format(date);
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
	    Date date2 = sdf.parse(today);
	    
	    // Parcours de la liste de rendez-vous
	    for(RendezVous rdv : this.listeRDV) {
	    	
	        // En fonction du paramètre on test si la date est avant, après ou pendant la date du jour
	    	// Le compteur est ensuite incrémenté
	        if (param == "ajd") 
	        	if (sdf.parse(rdv.getDate().toString()).compareTo(date2) == 0) 
	                cpt++;

	        if (param == "passe") 
	        	if (sdf.parse(rdv.getDate().toString()).compareTo(date2) < 0) 
	                cpt++;

	        if (param == "futur") 
	        	if (sdf.parse(rdv.getDate().toString()).compareTo(date2) > 0) 
	                cpt++;

	    }

	    return cpt;
	}


    //
    // GETTERS & SETTERS
    //
	
	/**
	 * Retourne la liste des rendez-vous
	 * @return La liste des rendez-vous
	 */
	public ArrayList<RendezVous> getListeRDV() {
		return listeRDV;
	}

	/**
	 * Modifie la liste de rendez-vous
	 * @param listeRDV : la liste de rendez-vous
	 */
	public void setListeRDV(ArrayList<RendezVous> listeRDV) {
		this.listeRDV = listeRDV;
	}


}
