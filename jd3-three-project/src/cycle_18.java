
public class cycle_18 {

	public static void main(String args[]) {
		
		double k = 0, e = 2.7182818284, x = 0;
		
		for (double i = -100; i <= 100; i++) {
			
			x = Math.pow(-1, i - 1) / i;
			
			if(x >= e) {
				
			k += x;
			
			}
		}
		
		System.out.println("k = " + k);
	}
	
}
