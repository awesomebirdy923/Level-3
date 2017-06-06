import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ComedyCentral {

	ArrayList<String> jokes;
	ArrayList<String> punchlines;
	int r;

	public ComedyCentral(){
		jokes = new ArrayList<String>();
		punchlines = new ArrayList<String>();
		jokes.add("How is Donald Trump going to shut down the Department of Education? By renaming it Trump University.");
		jokes.add("Where does a neuron keep its money? The brain bank.");
		jokes.add("What is a vampires favorite holiday? Fangsgiving!");
		punchlines.add("Carrot face.");
		punchlines.add("I used to think the brain was the most important organ. Then I thought, look what’s telling me that.");
		punchlines.add("You kill vegetarian vampires with a steak to the heart.");
		r = new Random().nextInt(3);
		generateJokes();
	}
	
	void generateJokes(){
		JOptionPane.showMessageDialog(null, jokes.get(r));
			JOptionPane.showMessageDialog(null, punchlines.get(r));
	}
	
	public static void main(String[] args) {
		new ComedyCentral();
	}
	
}
