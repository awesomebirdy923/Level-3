import java.util.ArrayList;

public class Last {

	
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.add(1);
		scores.add(2);
		scores.add(3);
		scores.add(4);
		scores.add(5);
		scores.add(6);
		scores.add(7);
		scores.add(8);
		scores.add(9);
		scores.add(10);
		last(scores);
	}
	
	private static void last(ArrayList<Integer> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " " + i);
			System.out.println(list.get(list.size()-1));
		}
	}
}
