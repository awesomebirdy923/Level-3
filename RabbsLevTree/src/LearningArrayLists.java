import java.util.ArrayList;

public class LearningArrayLists {

	static ArrayList<String> list = new ArrayList<String>();
	static int size;
	
	public void findItem(){}
	
	public static void insertItem(ArrayList item, int i, String string){
		item.add(i, string);
	}
	
	public static ArrayList<String> createArrayList(){
		return list;
	}
	
	public static void addToArrayList(ArrayList list, String string){
		list.add(string);
	}
	
	public static int getNumberOfItems(ArrayList listWithItems){
		for (int i = 0; i < listWithItems.size(); i++) {
			size++;
		}
		return size;
	}
	
	public static String getItem(ArrayList<String> list, int i){
		return list.get(i);
	}
	
	public static String iterateOver(ArrayList<String> listToBeIterated){
		String index = "";
		for (int i = 0; i < listToBeIterated.size(); i++) {
			index = index.concat(listToBeIterated.get(i));
		}
		return index;
	}
	
	public static int findItemOnList(ArrayList<String> maiNaemIsJeffList, String string){
			return maiNaemIsJeffList.indexOf(string);
	}
	
	public static ArrayList<Integer> createTypedArrayList(){
		return new ArrayList<Integer>();
	}
	
	public static ArrayList<String> createStringTypedArrayList(){
		return new ArrayList<String>();
	}
	
	public static Integer addAllInteger(ArrayList<Integer> integerList){
		int sum = 0;
		for (int i = 0; i < integerList.size(); i++) {
			sum += integerList.get(i);
		}
		return sum;
	}
	
	public static String addAllString(ArrayList<String> stringList){
		String index = "";
		for (int i = 0; i < stringList.size(); i++) {
			index = index.concat(stringList.get(i));
			System.out.println(stringList.get(i));
		}
		return index;
	}
	
	public static void replaceItem(ArrayList<String> listThatHasAnItemThatIsAboutToBeReplacedList, int i, String string){
		listThatHasAnItemThatIsAboutToBeReplacedList.set(i, string);	
	}
}
