package patient;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui définit une liste de Patient
 * @author paulj
 *
 */
public class ListePatient {
	

/**
 * Liste des Patient
 */
	private List<Patient> ListePatient;

public ListePatient() {
	super();
	ListePatient = new ArrayList<Patient>();
}

/**
 * Retourne la liste des rendez-vous
 * @return La liste des rendez-vous
 */
	public List<Patient> getListePatient() {
		return ListePatient;
	}

/**
 * Modifie la liste de rendez-vous
 * @param listeRDV: la nouvelle liste
 */
	public void setListePatient(List<Patient> ListePatient) {
		this.ListePatient = ListePatient;
	}


/**
 * Ajoute un rendez-vous à la liste
 * @param rdv: liste de rendez-vous
 */
	public void add(Patient pat)
	{
		this.ListePatient.add(pat);
		
	}
	
	
/**
 *	Retourne nombre d'éléments dans la liste de patients
 * @return taille de listePatient
 */
    public int size() {
    	 return this.ListePatient.size();
    	
    }
  
    /**
     * Retourne un object patient dans la liste
     * @param i: index dans la liste
     * @return le patient a l'index i de la liste 
     */
    public Patient get(int i)
    {
    	return this.ListePatient.get(i);
    }
}
