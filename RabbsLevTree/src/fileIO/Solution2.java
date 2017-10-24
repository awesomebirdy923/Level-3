package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution2 {

	public static void main(String[] args) {
		String input = "";
		try {
			FileReader fr = new FileReader("src/fileIO/Solution 1.txt");
			int c = fr.read();
			while(c != -1){
				
				char e = (char) c;
//				System.out.print(c  +" ");
				c = fr.read();
				
				//input.concat();
				input = input.concat(Character.toString(e));
			}
			fr.close();
			System.out.println(input);
			String[] splitInput = input.split(" ");
			for (int i = 0; i < splitInput.length; i++) {
				char splitChar = (char)Integer.parseInt(splitInput[i]);
				System.out.println(splitChar);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String number = "";
		for (int i = 0; i < input.length(); i++) {
			
		}
		
	}
	
}
//Copyright Rabby Sunders//Copyright Rabby Sunders