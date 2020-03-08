
public class cycle_17 {

	public static void main(String args[]) {
		
		double k = 1, a = 4, n = 15;
		
		for (double i = 0; i <= n - 1; i++) {
			k *= (a + i);
		}
		
		System.out.println("k = " + k);
	}
	
}
