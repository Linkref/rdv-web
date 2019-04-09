package medecin;

import java.util.ArrayList;



public class ListeMedecin {
	
	
	private ArrayList<Medecin> ListeMedecin;



	public ListeMedecin() {
		
		ListeMedecin = new ArrayList<Medecin>();;
	}



	public ArrayList<Medecin> getListeMedecin() {
		return ListeMedecin;
	}



	public void setListeMedecin(ArrayList<Medecin> listeMedecin) {
		ListeMedecin = listeMedecin;
	}
	
	public void add(Medecin med)
	{
		this.ListeMedecin.add(med);
		
	}
	
    public int size() {
   	 return this.ListeMedecin.size();
   	
   }
    
    public Medecin get(int i)
    {
    	return this.ListeMedecin.get(i);
    }
    
    public ArrayList<String> getListSpecialite()
    {
    	ArrayList<String> listSpe = new ArrayList<String>();
    	
    	for(int i=0;i<this.ListeMedecin.size();i++)
    	{
    		
    		if(listSpe.isEmpty())
    		{
    			listSpe.add(this.ListeMedecin.get(i).getSpecialite());
    		}
    		
    		if(!listSpe.contains(this.ListeMedecin.get(i).getSpecialite()))
			{
    			listSpe.add(this.ListeMedecin.get(i).getSpecialite());

			}
    	}
    	
    	return listSpe;
    }

}
