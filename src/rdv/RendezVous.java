package rdv;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RendezVous {


	private String date;
    private String heureDebut;
    private String medecin;
    private String patient;
    private String raisonVenue; 
    
    public RendezVous(String date, String heureDebut, String medecin, String patient, String raisonVenue){
        this.date = date;
        this.heureDebut = heureDebut;
        this.medecin = medecin;
        this.patient = patient;
        this.raisonVenue = raisonVenue;
    }  
    
    public String toString() {
    	return patient + " " + medecin + " " + date + " " + heureDebut + " " + raisonVenue;
    
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

	public RendezVous(){
		
    }


    
    public boolean equals(Object o) {
    	if (o == null)
    		return false;
    	if (!(o instanceof RendezVous))
    		return false;
    	RendezVous rdv = (RendezVous) o;
		return medecin.equals(rdv.medecin) && heureDebut.equals(rdv.heureDebut) && date.equals(rdv.date); 
    	
    }
    

    
}