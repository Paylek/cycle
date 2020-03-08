public class cycle_13 {

	public static void main(String args[]) {
		
		double k = 1;
		
		for (double i = -5; i <= 5; i = i + 0.5) {
			k = 5 - ((i * i) / 2);
			System.out.println("k = " + k + "         x = " + i);
		}
		

	}
	
}
