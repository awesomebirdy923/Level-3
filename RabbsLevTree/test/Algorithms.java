import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Algorithms {

	public static int findBrokenEgg(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> list) {
		double tallest = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > tallest) {
				tallest = list.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> list) {
		String longest = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > longest.length()) {
				longest = list.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> inputList) {
		for (int i = 0; i < inputList.size(); i++) {
			double doobel = inputList.get(i);
			for (int j = i; j < inputList.size(); j++) {
				if (doobel > inputList.get(j)) {
					doobel = inputList.get(j);
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

	public static List<String> sortDNA(List<String> order) {
		TreeMap<String, Integer> structureData = new TreeMap<String, Integer>();
		for (int i = 0; i < order.size(); i++) {
			structureData.put(order.get(i), order.get(i).length());
			// System.out.println(structureData);
		}
		DNAComparator comparator = new DNAComparator(structureData);
		TreeMap<String, Integer> newOrder = new TreeMap<String, Integer>(comparator);
		newOrder.putAll(structureData);
		System.out.println(newOrder);
		return new ArrayList(newOrder.keySet());
	}

	public static List<String> sortWords(List<String> order) {
		AsciiComparator comparator = new AsciiComparator(order);
		Collections.sort(order);
		return order;
	}

}

class DNAComparator implements Comparator<String> {
	TreeMap<String, Integer> map;

	public DNAComparator(TreeMap<String, Integer> structureData) {
		this.map = structureData;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return map.get(o1).compareTo(map.get(o2));
	}

}

class AsciiComparator implements Comparator<String> {

	List<String> list;

	public AsciiComparator(List<String> list) {
		this.list = list;
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}