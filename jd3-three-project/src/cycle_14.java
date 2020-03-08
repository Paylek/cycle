
public class cycle_14 {

	public static void main(String args[]) {
		
		double k = 0, n = 15;
		
		for (double i = n; i >= 1; i--) {
			k += 1 / i;
		}
		
		System.out.println("k = " + k);
	}
	
}
