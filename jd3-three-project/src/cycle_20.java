
public class cycle_20 {

	public static void main(String args[]) {
		
		double k = 0, e = 2.7182818284, x = 0;
		
		for (double i = -100; i <= 100; i++) {
			
			x = 1 / (3 * i - 2) * (3 * i + 1);
			
			if(x >= e) {
				
			k += x;
			
			}
		}
		
		System.out.println("k = " + k);
	}
	
}
