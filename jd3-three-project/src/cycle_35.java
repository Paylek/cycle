import java.util.Scanner;

public class cycle_35 {

	public static void main(String args[]) {
		
System.out.println("35. Найдите количество четных цифр данного натурального числа.");
		
		int n = scannerInt();
		
		int x;
		
		System.out.println("Введенное значениие " + n);
		
		int count = (n == 0) ? 1 : 0;
		
		while(n != 0) {
			
			x = n % 10;
			
			if(x % 2 == 0) {
				
				count++;
			}
			
			n = n / 10;
		}
		
		System.out.println("Количество четных чисел " + count);
		
		System.out.println();
		
	}
	
public static int scannerInt() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int number;
		
		System.out.println("Введите число: \r");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}
	
	}