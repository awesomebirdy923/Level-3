import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class DinnerDecider {
ArrayList<String> list;
ArrayList<String> repeats;
int food;

public DinnerDecider(){
	list = new ArrayList<String>();
	repeats = new ArrayList<String>();
	list.add("Eggs");
	list.add("Pancakes");
	list.add("Waffles");
	list.add("Eggs that are scrambled");
	list.add("Pancakes with maple syrup");
	list.add("Waffles with maple syrup");
	list.add("Eggs that are scrambled with bacon");
	list.add("Pancakes with maple syrup and butter");
	list.add("Waffles with maple syrup and milk");
	list.add("Juice");
	food = new Random().nextInt(10);
	chooseFood();
}

public void chooseFood(){
	String amt = JOptionPane.showInputDialog("How much food do you want?");
	int amount = Integer.parseInt(amt);
	for(int i = 1; i <= amount; i++){
    food = new Random().nextInt(10);
    if(repeats.contains(list.get(food))){
    	 food = new Random().nextInt(10);	
    }
	JOptionPane.showMessageDialog(null, list.get(food));
	repeats.add(list.get(food));
	}
}

public static void main(String[] args) {
	new DinnerDecider();
}
}
