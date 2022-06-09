package toys;

import java.util.Scanner;

import toys.design_patterns.BikeFactory;
import toys.design_patterns.BikeToy;
import toys.design_patterns.BikesNeeded;
import toys.design_patterns.Command;
import toys.design_patterns.DollFactory;
import toys.design_patterns.DollToy;
import toys.design_patterns.DollsNeeded;
import toys.design_patterns.MagicalBoard;
import toys.design_patterns.Observer;
import toys.design_patterns.SingletonSanta;
import toys.design_patterns.ToyFactory;
import toys.design_patterns.Dwarves;
import toys.design_patterns.DwarvesSubscriber;

public class Main {

	public static void main(String[] args) {
		
		SingletonSanta iNeed = SingletonSanta.getInstance();
		ToyFactory bikeFactory = new BikeFactory();
		ToyFactory dollFactory = new DollFactory();
		BikeToy toyB = new BikeToy();
		Command bikesNeeded = new BikesNeeded(toyB);
		DollToy toyD = new DollToy();
		Command dollsNeeded = new DollsNeeded(toyD);
		MagicalBoard remote = new MagicalBoard();
		Dwarves topic = new Dwarves();
		Observer dw1 = new DwarvesSubscriber("Dwarf 1");
		Observer dw2 = new DwarvesSubscriber("Dwarf 2");
		Observer dw3 = new DwarvesSubscriber("Dwarf 3");
	
		
		//========================================================================
		

		Scanner intro =  new Scanner(System.in);
		int program;
		
		do {
			System.out.println("Santa's in need of Toys!");
			System.out.println("1) I need Bikes!");
			System.out.println("2) I need Dolls!");
			System.out.println("");
			System.out.println("0) Exit");

		
			program = intro.nextInt();
		
			switch(program){
			  case 0: 
				  System.out.println("End Program!");
				break;  
			 
			  case 1:
				  iNeed.postMessage("I need Bikes!");		
				
				  topic.unsubscribe(dw1);  //because i don't want this particular row to add up each time i change the cases
				  topic.unsubscribe(dw2);
				  topic.unsubscribe(dw3);
				  topic.subscribe(dw1);	
				  topic.setSpeech("I'll notify the others!");
				  
				  remote.setCommand(bikesNeeded);
				  remote.isCommandSaid();
				  
				  bikeFactory.produceProduct("Bikes");
				  
				  topic.unsubscribe(dw1);
				  topic.unsubscribe(dw2);
				  topic.unsubscribe(dw3);
				  topic.subscribe(dw2);
				  topic.setSpeech("We are ready with the production and starting to load the Sledge!");
				  
				  topic.unsubscribe(dw1);
				  topic.unsubscribe(dw2);
				  topic.unsubscribe(dw3);
				  topic.subscribe(dw3);
				  topic.setSpeech("The Sledge is loaded and ready for your arrival Santa!");
				break;
		   
			  case 2: 
				  iNeed.postMessage("I need Dolls!");		
				
				  topic.unsubscribe(dw1);  //because i don't want this particular row to add up each time i change the cases
				  topic.unsubscribe(dw2);
				  topic.unsubscribe(dw3);
				  topic.subscribe(dw1);	
				  topic.setSpeech("I'll notify the others!");
				  
				  remote.setCommand(dollsNeeded);
				  remote.isCommandSaid();
				
				  dollFactory.produceProduct("Dolls");
				  
				  topic.unsubscribe(dw1);
				  topic.unsubscribe(dw2);
				  topic.unsubscribe(dw3);
				  topic.subscribe(dw2);
				  topic.setSpeech("We are ready with the production and starting to load the Sledge!");
				  
				  topic.unsubscribe(dw1);
				  topic.unsubscribe(dw2);
				  topic.unsubscribe(dw3);
				  topic.subscribe(dw3);
				  topic.setSpeech("The Sledge is loaded and ready for your arrival Santa!");
				break;
		    default:
			  System.out.println("Грешна програма!");	 
			}
			
			System.out.println("");
		}
		
		while(program != 0);
		intro.close();
	}
}
