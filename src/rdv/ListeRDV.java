package rdv;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui définit une liste de rendez-vous
 * @author paulj
 *
 */
public class ListeRDV {
	

/**
 * Liste des rendez-vous
 */
	private List<RendezVous> listeRDV;

	
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
	public List<RendezVous> getListeRDV() {
		return listeRDV;
	}

/**
 * Modifie la liste de rendez-vous
 * @param listeRDV
 */
	public void setListeRDV(List<RendezVous> listeRDV) {
		this.listeRDV = listeRDV;
	}


/**
 * Ajoute un rendez-vous à la liste
 * @param rdv: liste de rendez-vous
 */
	public void add(RendezVous rdv)
	{
		this.listeRDV.add(rdv);
	}

}
