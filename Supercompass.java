import java.util.ArrayList;

public class Supercompass {

	ArrayList<Distance_covered> dlist = new ArrayList<Distance_covered>();
	ArrayList<Compass> dilist = new ArrayList<Compass>();
	private int compdistance = 300;
	private int compdirection = 5;
	
	public void method1(Distance_covered D, Compass C) {
		dlist.add(D);
		dilist.add(C);
		
		//System.out.println(D);
	
		
		
	}
	
	
	public int getCount() {
		int j = 0;
		for(int i=0; i< 5; i++)
		{
			if(dlist.get(i).getdistance() <= compdistance && dilist.get(i).getDirection() <= compdirection) {
				
			
            j = j+1;
            System.out.println();
            
		}
		
		}
		return j;
	}
	
}