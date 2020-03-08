import java.util.Scanner;

public class cycle_33 {

	public static void main(String args[]) {
	
System.out.println("33. Найдите наибольшую цифру данного натурального числа.");
		
		int n = scannerInt();
		
		System.out.println("Вы ввели " + n);
		
		int num = n;
		
		int x;
		
		int count = (num == 0) ? 1 : 0;
		
        while (num != 0) {
        	
            count++;
            
            num = num / 10;
        }
        
        System.out.println("Количество цифр " + count);
        
        int number[] = new int [count];
        
        int i = 0;
        
		while(i < count) {
			
			x = n % 10;
			
			number[i] = x;
			
			n = n / 10;
			
			i++;
		}
		
		int max = 0;
		
		for (i = 0; i <= count-1; i++) {
			
            if (number[i] > max) {
            	
                max = number[i];
            }
        }
		
        System.out.println("Наибольшая цифра в числе  равна " + max);
        
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