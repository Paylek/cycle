
public class cycle_16 {

	public static void main(String args[]) {
		
		double k = 1;
		
		for (double i = 3; i <= 10; i++) {
			k *= (1 + 2) * (1 + 2 + i);
		}
		
		System.out.println("k = " + k);
	}
	
}
