import java.util.Scanner;

public class cycle_25 {

	public static void main(String args[]) {
		
		double k = 1, x = 0;
		
		x = readXFromConsole();
		
		
		for (double i = x; i >= 1; i--) {
			
		k *= (x - i + 1);
			
		}
		
		System.out.print("k: " + k);
		
	}
	
	public static double readXFromConsole() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.print("Enter x: ");
		x = sc.nextDouble();
		
		return x;
	}
	
}
