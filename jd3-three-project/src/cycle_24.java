
public class cycle_24 {

	public static void main(String args[]) {
		
		double k = 0, n = 15, m = 0;
		int  a = 0, b = 0;
		
		for (double i = 0; i <= n; i++) {
			
			if (i % 2 == 0) {
			
			k += i;
			
			}
		}
		
		m = k;
		
		System.out.println("m = " + m);
		
		 a = (int) (m / 10);
	     b = (int) (m - a * 10);
	     System.out.println("k = " + b + a);
	}
	
}
