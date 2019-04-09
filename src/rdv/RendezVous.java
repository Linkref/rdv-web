package rdv;

public class RendezVous {

    
	private String date;
    private String heureDebut;
    private String heureFin;
    private String medecin;
    private String patient;
    private String raisonVenue; 


    public void setDate(String date) {
		this.date = date;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
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

	public String getHeureFin() {
		return heureFin;
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

    public RendezVous(String date, String heureDebut, String heureFin, String medecin, String patient, String raisonVenue){

        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.medecin = medecin;
        this.patient = patient;
        this.raisonVenue = raisonVenue;
    }  






 /*public static void main(String[] args) {
        try {
        	ListeRDV laListe = new ListeRDV();
        	ListeRDV laListe2=null;
        	
            RendezVous rdv1 = new RendezVous("12/12/12", "15:30", "15:45", "Dr.Lulu", "Mr.Louis", "TB");
            laListe.add(rdv1);          
            XMLTools.encodeToFile(laListe, "rdv.xml");
            
            
            laListe2= (ListeRDV) XMLTools.decodeToObject("rdv.xml");

            RendezVous rdv2 = new RendezVous("11/11/11", "17:30", "17:45", "Dr.Lulu", "Mr.toto", "TB");  
            laListe2.add(rdv2);
            XMLTools.encodeToFile(laListe2, "rdv.xml");
            
            ListePatient patients= new ListePatient();
        	
        	Patient pat1 = new Patient("toto","tata");
        	Patient pat2 = new Patient("titi","tete");
        	patients.add(pat1);
        	patients.add(pat2);        	
            
        	 XMLTools.encodeToFile(patients, "patient.xml");
           
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }*/
}