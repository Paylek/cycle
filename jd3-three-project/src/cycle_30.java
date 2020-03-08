public class cycle_30 {

	public static void main(String args[]) {
		
System.out.println("30. Написать программу, переводящую римские цифры в арабские. ");
		
		int i = 0;
		String roman[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	
		while(i <= roman.length-1) {
			
			System.out.println("Арабская цифра " + i + " соответствует римской " + roman[i]);
			
			i++;
		}
		
		System.out.println();
		
	}
	}