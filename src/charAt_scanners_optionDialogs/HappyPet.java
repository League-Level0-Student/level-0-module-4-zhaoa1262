package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		String pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
		
		for(int i = 0 ; i < 5; i++) {
		
			if(happinessLevel >= 25) {
				JOptionPane.showMessageDialog(null,"You love your pet!");
				break;
			}
			
			
		int task = JOptionPane.showOptionDialog(null, "What will you do to keep your pet happy?", "Request", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "feed", "bathe", "groom" }, null);
		
		
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			

			// 5. Use user input to call the appropriate method created in step 4.
			
		
			if(task == 0) {
				feed(pet);
			}
			
			if(task == 2) {
				groom(pet);
			}
			
			if(task == 1) {
				bathe(pet);
			}
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}
int level = 0;
	// 4. Create methods to handle each of your user selections.
	private static void feed (String feedThePet) {
		JOptionPane.showMessageDialog(null, "Your pet will sleep happily after the feeding");
		happinessLevel += 10;
	}
	
	private static void bathe (String waterThePet) {
		JOptionPane.showMessageDialog(null, "Your pet will shake happily after the cleansing");
		happinessLevel += 5;
	}
	
	private static void groom (String groomThePet) {
		JOptionPane.showMessageDialog(null, "Your pet will strut happily down the sidewalk");
		 happinessLevel += 15;
	}
}
		
		
		//groom = 2
		//bathe = 1
		//feed = 0
	
	
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
