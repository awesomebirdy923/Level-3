
public class FIBBBBBBBBBBBB {

	public static void main(String[] args) {
		printFibb(200);
	}
	
	public static void printFibb(int amount) {
		int first = 0;
		int second = 1;
		int current = 0;
		System.out.println(first);
		System.out.println(second);
		while(true) {
				current = first + second;
				first = second;
				second = current;
				if(current>=amount) {
					break;
				}
				System.out.println(current);
		}
	}

}