//import java.util.ArrayList;
import java.util.Random;
public class Runner {

	
	public static void main(String[] args) {
		
		Random rand = new Random();
		Supercompass scompass = new Supercompass();
		
		for (int i =0; i< 4; i++ ) {
			Distance_covered D = new Distance_covered();
			Compass C = new Compass();
			
			D.setdistance(rand.nextInt(300));
			C.setDirection(rand.nextInt(4));
			
		
			
			
			scompass.method1(D, C);
		
			
		}
		
		
		
		//ArrayList<Champions> championsList = new ArrayList<>();
		Players play = new Players();
		
	
		Warrior p1 = new Warrior ("Kratos", "Long Sword", 36);
		Rogue p2 = new Rogue ("Shaco", "Daggers", 18);
		Mage p3 = new Mage ("Loki", "Staff", 400);
		Warrior p4 = new Warrior ("Slayer", "Fists", 25);
		
		p1.setMovements("TRUDGES");
		p2.setMotion("DASHES");
		p3.setProceeds("TELEPORTS");
		p4.setMovements("TRUDGES");
		
		
		play.championsList.add(p1);
		play.championsList.add(p2);
		play.championsList.add(p3);
		play.championsList.add(p4);

		
		
		System.out.println("Hello Summoner" +p2 +"Proceed on your Journey" );
		
	}
}

