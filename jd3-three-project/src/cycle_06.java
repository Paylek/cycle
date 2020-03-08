import java.util.Scanner;

public class cycle_06 {

	public static void main(String args[]) {
		
		int x = 0, k = 0;
		
		x = readXFromConsole();
		k = x;
		x = printResult(x);
		x = x - k;
		print(x);
		
	}
	
	public static int printResult(int x) {
		
		for (int i = x; i >= 1; i--) {
			
			x += i;
			
		}
		return x;
		
	}
	
	public static void print(int x) {
		
		System.out.print("x = " + x);
		
	}
	
	public static int readXFromConsole() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Enter x: ");
		x = sc.nextInt();
		
		return x;
	}
}

