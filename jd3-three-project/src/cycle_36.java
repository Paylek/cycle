public class cycle_36 {

	public static void main(String args[]) {
		
		System.out.println("36.  Два  двузначных  числа,  записанных  одно  за  другим  ,  образуют  "
				+ "четырёхзначное  число,  которое делится на их произведение. Найти эти числа. ");
		
		int a;
		int b;
		int ab;
		
		for(a = 10; a <= 99; a++) {
			
			for(b = 10; b <= 99; b++) {
				
				ab = a * 100 + b;
				
				if(ab % (a * b) == 0) {
					
					System.out.println("Число " + a + " и " + b);
				}
			}
		}
		
		System.out.println();	
		
	}
	}