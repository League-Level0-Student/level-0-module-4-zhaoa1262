package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ChooseYourAdventure {
public static void main(String[] args) {
	
	int firstSentence = JOptionPane.showOptionDialog(null, "You are entering a pointless story where nothing happens at the end. "
			+ "You left the island of Orlon in order to attain...", "Request", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "an artifact that most likely does not even exist", "treasure that has already been found" }, null);
	
	if (firstSentence == 1) {
		String firstChoice = JOptionPane.showInputDialog("After you have walked to the edge of the pointless beach, you observe your surroundings:"
				+ " the only means of transportation is a rickety, old wooden kayak. Would you like to begin your journey on a boat that is sure to sink?");
	}
	
if (firstSentence == 0) {
		
	}
	
	// treasure = 1
	// artifact = 0
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}