package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ChooseYourAdventure {
	public static void main(String[] args) {

		int firstSentence = JOptionPane.showOptionDialog(null,
				"You are entering a pointless story where nothing happens at the end. "
						+ "You left the island of Orlon in order to attain...",
				"Request", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {
						"an artifact that most likely does not even exist", "treasure that has already been found" },
				null);

		if (firstSentence == 1) {
			String firstChoice = JOptionPane.showInputDialog(
					"After you have walked to the edge of the pointless beach, you observe your surroundings:"
							+ " the only means of transportation is a rickety, old wooden kayak. Would you like to begin your journey on a boat that is sure to sink? "
							+ "All future fate determining choices will result in yes or no questions.");

			if (firstChoice.equals("no")) {
				JOptionPane.showMessageDialog(null,
						"As you attempt heroism by swimming in the water, you begin to experience fatigue, and eventually, you have drowned."
								+ "(Just in case you were wondering, the prince/princess will not come to save you. Your fate is left to the creatures of the sea ;)");
			}

			if (firstChoice.equals("yes")) {
				String secondChoice = JOptionPane.showInputDialog(
						"Yay, you will continue unlike the other poor fellows. The boat you travel on will not last very long, "
								+ "so be very wise as not to be wrong! You paddled on pathetic little boat for what seems like forever, you notice the sun setting, "
								+ "will you take a break from laborious, pointless paddling?");

				if (secondChoice.equals("no")) {
					String thirdChoice = JOptionPane.showInputDialog(
							"Congrats, you made it! You paddle until you reached the legendary island. "
									+ "The journey has been so tiresome that you immediately fall asleep under a shaded area. When you have recovered, "
									+ "you notice a strange shadow cross your resting location. Should you play dead?");

					if (thirdChoice.equals("yes")) {
						JOptionPane.showMessageDialog(null,
								"The giant shadow pounces before you can see what it is. Your journey has ended!");
					}

					if (thirdChoice.equals("no")) {
						JOptionPane.showMessageDialog(null,
								"The giant shadow catches you before you can run away. Your journey has ended!");
					}

				}
			}

			if (firstSentence == 0) {
				String firstAnswer = JOptionPane.showInputDialog(
						"After you have walked to the edge of the pointless beach, you observe your surroundings:"
								+ " You can see the top of the underwater pyramid, do you swim to the door?");

				if (firstAnswer.equals("yes")) {
					String secondAnswer = JOptionPane.showInputDialog(
							"You swim the metal door, thirteen feet below the surface, do you dare to enter the pyramid?");

					if (secondAnswer.equals("yes")) {
						JOptionPane.showMessageDialog(null,
								"As you enter the pyramid, you realize that you have floated too high, and a lever has been pulled down. "
										+ "The pyramid sinks, bringing you down with it. Your journey has ended.");
					}

					if (secondAnswer.equals("no")) {
						JOptionPane.showMessageDialog(null,
								"You have run out of air due to the stalling of decisions. Your journey has ended!");
					}
				}

				if (firstAnswer.equals("no")) {
					JOptionPane.showMessageDialog(null,
							"The freezing water has given you hypothermia. Your journey has ended");
				}

			}

		}

		// treasure = 1
		// artifact = 0

	}
}