import java.util.ArrayList;
import java.util.List;

public class ListeRDV {
	
	private List<RendezVous> listeRDV;

	
	
	public ListeRDV() {
		
		// TODO Auto-generated constructor stub
		listeRDV = new ArrayList<RendezVous>();
	}



	public List<RendezVous> getListeRDV() {
		return listeRDV;
	}



	public void setListeRDV(List<RendezVous> listeRDV) {
		this.listeRDV = listeRDV;
	}



	public void add(RendezVous rdv)
	{
		this.listeRDV.add(rdv);
	}

}
