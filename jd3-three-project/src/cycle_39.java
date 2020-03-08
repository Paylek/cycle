public class cycle_39 {

	public static void main(String args[]) {
		
		System.out.println("39.  В  трехзначном  числе  зачеркнули  старшую  цифру.  Когда  полученное  "
				+ "число  умножили  на  7,  то получили исходное число. Найти это число. ");
		
		int n;
		
		for(n = 100; n <= 999; n++) {
			
			if(n == 7 * (n % 100)) {
				
				System.out.println("Это число " + n);
			}
		}
		
		System.out.println();
		
	}
	}