
public class cycle_23 {

	public static void main(String args[]) {
		
		double k = 0;
		
		for (double i = -10; i <= 10; i++) {
			
			k += (1 / Math.tan(i / 3)) + (1 / (2 * Math.sin(i)));
			System.out.println("i = " + i + "                 k = " + k);
			
		}
		
	}
	
}
