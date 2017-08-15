import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Iterating {
public static void main(String[] args) {
ArrayList<Integer> numberList = new ArrayList<Integer>();
int sum = 0;
for(int i = 1; i < 50; i++){
	int randomNumber = new Random().nextInt(255);
	numberList.add(randomNumber);
	System.out.println(randomNumber);
}
Iterator<Integer> iterator = numberList.iterator(); 
while(iterator.hasNext()){
	sum = sum + iterator.next();
}
System.out.println(sum);
}
}
