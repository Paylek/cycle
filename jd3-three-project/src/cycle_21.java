
public class cycle_21 {

	public static void main(String args[]) {
		
		double k = 0;
		
		for (double i = -10; i <= 10; i++) {
			k = i - Math.sin(i);
			System.out.println("x = " + i + "         k = " + k);
			
		}
		
		
	}
	
}
