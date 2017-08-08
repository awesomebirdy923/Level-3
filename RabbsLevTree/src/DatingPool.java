import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class DatingPool {
	static HashMap<String, String> elgibleBachelors = new HashMap<String, String>();
	static ArrayList<String> dates = new ArrayList<String>();
	public static void main(String[] args) {
		elgibleBachelors.put("Max", "Conservative");  
		elgibleBachelors.put("Bob", "conservative"); 
		elgibleBachelors.put("Diego ", "libertarian");
		elgibleBachelors.put("Felix", "Independant");
		elgibleBachelors.put("William", " Republican");  
		elgibleBachelors.put("Chuck", " Republican");  
		elgibleBachelors.put("Matthew ", "hai");  
		elgibleBachelors.put("Jose ", "Democrat");  
		elgibleBachelors.put("Elizabeth ", "liberal"); 
		for(Entry bachelor: elgibleBachelors.entrySet()){
		if(bachelor.getValue() == "liberal" || bachelor.getValue() == "Democrat" || bachelor.getValue() == "hai"){
			dates.add(bachelor.getKey().toString());
		}
		}
		for (String bachelor : dates) {
			System.out.println(bachelor);
		}
	}
}