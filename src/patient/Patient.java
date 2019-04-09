package patient;
/**
 * Classe qui définit un patient
 * @author paulj
 *
 */
public class Patient {
	
	/**
	 * Nom du patient
	 */
	private String nom;
	/**
	 * Prenom du patient
	 */
	private String prenom;
	
	
	public Patient() {
	
	}
	
	/**
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Patient(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return  nom +" "+ prenom;
	}
	
	
	
}
