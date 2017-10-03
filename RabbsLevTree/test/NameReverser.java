import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.JOptionPane;

public class NameReverser {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What's your name", null);
		char[] inputList = input.toCharArray();
		Stack<Character> charStack = new Stack<Character>();
		char[] outputList = new char[inputList.length];
		for (int i = 0; i < inputList.length; i++) {
			charStack.push(inputList[i]);
		}
		int j = 0;
		while (!charStack.empty()) {
			outputList[j] = charStack.pop();
			j++;
		}
		// System.out.println(outputList);
		String nameBackwards = "";
		for(Character e: outputList) {
			nameBackwards = nameBackwards.concat(e.toString());
		}
		
		JOptionPane.showMessageDialog(null, "This is your name backwards: " + nameBackwards);
	}
}
