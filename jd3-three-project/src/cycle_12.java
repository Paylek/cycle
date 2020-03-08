public class cycle_12 {

	public static void main(String args[]) {
		
		long k = 1;
		
		for (int i = 1; i <= 58; i += 6) {
			k *= i;
		}
		
		System.out.print("k = " + k);
	}
	
}
