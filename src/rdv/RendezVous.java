package rdv;

/**
 * Objet qui définit un rendez-vous
 */

public class RendezVous {

	private String date;
    private String heureDebut;
    private String medecin;
    private String patient;
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
	 * Vérifie si deux rdv sont à la même heure à la même date
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
    
	public String getDate() {
		return date;
	}

	public String getHeureDebut() {
		return heureDebut;
	}

	
	public String getMedecin() {
		return medecin;
	}

	public String getPatient() {
		return patient;
	}

	public String getRaisonVenue() {
		return raisonVenue;
	}
    

    public void setDate(String date) {
		this.date = date;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public void setRaisonVenue(String raisonVenue) {
		this.raisonVenue = raisonVenue;
	}
	
    

    
}