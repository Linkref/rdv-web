package rdv;
import java.util.ArrayList;


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
	
	public void afficher() {
		 System.out.println("Boucle for");
		  for(int i = 0 ; i < listeRDV.size(); i++)
		   System.out.println(listeRDV.get(i));
	}


}
