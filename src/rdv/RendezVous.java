package rdv;

import java.io.Serializable;

/**
 * Objet qui définit un rendez-vous
 */

public class RendezVous implements Serializable{

	/**
	 * Date du rendez-vous
	 */
	private String date;
	
	/**
	 * Heure du rendez-vous
	 */
    private String heureDebut;
    
	/**
	 * Medecin du rendez-vous
	 */
    private String medecin;
    
	/**
	 * Patient du rendez-vous
	 */
    private String patient;
    
	/**
	 * Raison du rendez-vous
	 */
    private String raisonVenue; 
    
    /**
     * Constructeur
     */
    public RendezVous(String date, String heureDebut, String medecin, String patient, String raisonVenue){
        this.date = date;
        this.heureDebut = heureDebut;
        this.medecin = medecin;
        this.patient = patient;
        this.raisonVenue = raisonVenue;
    }  
    
    /**
     * Constructeur par défaut nécessaire à la sérialisation
     */
	public RendezVous(){
		
    }
	
	/**
	 * Vérifie si deux rdv sont à la même heure à la même date pour un même médecin
	 * @return boolean
	 */
    public boolean equals(Object o) {
    	if (o == null)
    		return false;
    	if (!(o instanceof RendezVous))
    		return false;
    	RendezVous rdv = (RendezVous) o;
		return medecin.equals(rdv.medecin) && heureDebut.equals(rdv.heureDebut) && date.equals(rdv.date); 
    	
    }
    

    //
    // GETTERS & SETTERS
    //
    
	/**
	 * Retourne la date du rendez-vous
	 * @return La date du rendez-vous
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Retourne l'heure du rendez-vous
	 * @return  l'heure du rendez-vous
	 */
	public String getHeureDebut() {
		return heureDebut;
	}

	/**
	 * Retourne le medecin du rendez-vous
	 * @return le medecin du rendez-vous
	 */
	public String getMedecin() {
		return medecin;
	}

	/**
	 * Retourne le patient du rendez-vous
	 * @return le patient du rendez-vous
	 */
	public String getPatient() {
		return patient;
	}

	/**
	 * Retourne la raison du rendez-vous
	 * @return La raison du rendez-vous
	 */
	public String getRaisonVenue() {
		return raisonVenue;
	}
    

	/**
	 * Modifie la date du rendez-vous 
	 * @param date : la date
	 */
    public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Modifie l'heure du rendez-vous 
	 * @param heureDebut : l'heure du rdv
	 */
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	/**
	 * Modifie le medecin du rendez-vous 
	 * @param medecin
	 */
	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	/**
	 * Modifie le patient du rendez-vous 
	 * @param patient
	 */
	public void setPatient(String patient) {
		this.patient = patient;
	}

	/**
	 * Modifie la raison du rendez-vous 
	 * @param raisonVenue
	 */
	public void setRaisonVenue(String raisonVenue) {
		this.raisonVenue = raisonVenue;
	}
	
    

    
}