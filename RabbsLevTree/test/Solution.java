import java.util.*;
class Solution{
   
	static int e = 0;
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in).useDelimiter(";");
      String input = sc.nextLine();
//      while (sc.hasNext()) {
//         input=sc.next();
//      }
      System.out.println(input);
      char[] brackets = input.toCharArray();
      //Complete the code
      for(int i = 0; i < brackets.length; i++) {
    	    	  e += orderStack(brackets[i]);
      }
      if(e == 0){
    	  	System.out.println(true);
      }else{
    	  System.out.println(false);
      }
      sc.close();
   }
    
    static int orderStack(char brackets){
        if(brackets == '(' || brackets == '[' || brackets == '{'){
            return 1;
        }else if(brackets == ')' || brackets == ']' || brackets == '}'){
            return -1;
        }
		return 0;
        
        
    }
    
}