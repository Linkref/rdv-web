package rdv;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * Classe qui d�finit une liste de rendez-vous
 * @author paulj
 *
 */
public class ListeRDV {
	

/**
 * Liste des rendez-vous
 */
	private ArrayList<RendezVous> listeRDV;

	
/**
 * 	Initialise la liste
 */
	public ListeRDV() {
		listeRDV = new ArrayList<RendezVous>();
	}


/**
 * Retourne la liste des rendez-vous
 * @return La liste des rendez-vous
 */
	public ArrayList<RendezVous> getListeRDV() {
		return listeRDV;
	}

/**
 * Modifie la liste de rendez-vous
 * @param listeRDV
 */
	public void setListeRDV(ArrayList<RendezVous> listeRDV) {
		this.listeRDV = listeRDV;
	}


/**
 * Ajoute un rendez-vous � la liste
 * @param rdv: liste de rendez-vous
 */
	public void add(RendezVous rdv)
	{
		this.listeRDV.add(rdv);
	}
	
	public void supprimer(String date, String heure, String medecin)
	{
		RendezVous rdvSup=new RendezVous(date,heure,medecin,null,null);
		for(int i=0; i<this.listeRDV.size();i++)
		{
			if(listeRDV.get(i).equals(rdvSup))
				this.listeRDV.remove(listeRDV.get(i));	
		}
	
	}
	
	public void afficher() {
		  for(int i = 0 ; i < listeRDV.size(); i++)
		   System.out.println(listeRDV.get(i));
	}

    public int compterRdv(String param) throws ParseException {
    	
    	int cpt = 0;

        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String today = formatter.format(date);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        Date date2 = sdf.parse(today);
        
        
        for(RendezVous rdv : this.listeRDV) {
        	
            
            if (param == "ajd") {
            	if (sdf.parse(rdv.getDate().toString()).compareTo(date2) == 0) {
                    cpt++;
                }
            }
            if (param == "passe") {
            	if (sdf.parse(rdv.getDate().toString()).compareTo(date2) < 0) {
                    cpt++;
                }
            }
            if (param == "futur") {
            	if (sdf.parse(rdv.getDate().toString()).compareTo(date2) > 0) {
                    cpt++;
                }
            }
            
        }


        return cpt;
    }

}
