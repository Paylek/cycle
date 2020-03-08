public class cycle_34 {

	public static void main(String args[]) {
		
System.out.println("34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15. ");
		
		int x;
	
		
		for(int i = 1000; i <= 9999; i++) {
			
			int n = i;
			
			int a = 0;
			
			while(n != 0) {
				
				x = n % 10;
				
				a = a + x;
				
				n = n / 10;
			}
			
			if(a == 15) {
				
				System.out.print(i + " \\ ");
			}
		}
		
		System.out.println();
		
	}
	}
	