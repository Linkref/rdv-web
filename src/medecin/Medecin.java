package medecin;

public class Medecin {
	
	private String nom;
	private String prenom;
	private String specialite;
	
	
	
	public Medecin() {

	}

	public Medecin(String nom, String prenom, String specialite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	@Override
	public String toString() {
		return  nom +" "+ prenom;
	}
	
	

}