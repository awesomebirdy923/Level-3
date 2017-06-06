import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class BandNameGenerator {

	ArrayList<String> adjectives;
	ArrayList<String> nouns;
	int r;

	public BandNameGenerator(){
		adjectives = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives.add("Flaming");
		adjectives.add("Bombastic");
		adjectives.add("Majestic");
		nouns.add("Sushi");
		nouns.add("Popcorn");
		nouns.add("Fluff");
		r = new Random().nextInt(3);
		generateadjectives();
	}
	
	void generateadjectives(){
		JOptionPane.showMessageDialog(null, adjectives.get(r) + " " + nouns.get(r));
	}
	
	public static void main(String[] args) {
		new BandNameGenerator();
	}
}
