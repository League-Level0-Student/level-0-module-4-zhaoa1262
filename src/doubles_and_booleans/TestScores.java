package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String scores = JOptionPane.showInputDialog("What is your test score?");
	double score = Double.parseDouble(scores);
	
	if(score>90) {
		JOptionPane.showMessageDialog(null, "You performed well on that test!");
	}
	
	if(score<90) {
		JOptionPane.showMessageDialog(null, "Oh no, try harder next time!");
	}
}
}
