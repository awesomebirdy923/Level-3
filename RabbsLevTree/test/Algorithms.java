import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List <String> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				count++;
			}
		}
		return count;
	}
	public static double findTallest(List <Double> list) {
		double tallest = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) > tallest) {
				tallest = list.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List <String> list) {
		String longest = "";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).length() > longest.length()) {
				longest = list.get(i);
			}
		}
		return longest;
	}
	
	public static boolean containsSOS(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> inputList){
		for (int i = 0; i < inputList.size(); i++) {
			double doobel = inputList.get(i);
			for (int j = i; j < inputList.size(); j++) {
				if(doobel > inputList.get(j)) {
					doobel=inputList.get(j);
				}
			}
			int k = inputList.indexOf(doobel);
			double temp = inputList.get(i);
			inputList.set(i, doobel);
			inputList.set(k, temp);
				System.out.println(inputList);
		}
		return inputList;
	}
}