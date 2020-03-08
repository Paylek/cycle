import java.util.Scanner;

public class cycle_28 {

	public static void main(String args[]) {
	
		
		System.out.println("28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить \r\n" + 
				"результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а \r\n" + 
				"также  на  ввод  Y=0  при  делении.  Организовать  возможность  многократных  вычислений  без \r\n" + 
				"перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять \r\n" + 
				"‘0’. ");
		
		for(;;) {
			
			System.out.println("Введите значение Х: ");
			
			double x = scannerDouble();
			
			System.out.println("Введите значение Y: ");
			
			double y = scannerDouble();
		
			System.out.println("Введите символ операции (+, -, /, *) :");
		
			String str = scannerString();
			
			System.out.println("Вы ввели " + x + " " + str + " " + y);
		
			double z = 0;
		
			switch(str) {
				case "+":
					
					z = x + y;
				
					break;
				
				case "-":
					
					z = x - y;
				
					break;
				
				case "/":
					if(y == 0) {
						System.out.println("На ноль делить нельзя!");
						z = 0;
					}
					else {
						
						z = x / y;
					}
					
					break;
				
				case "*":
					z = x * y;
					
					break;	
					
				default:
					
					System.out.println("Вы ввели не существующую операцию. Попробуйте еще раз!");
			}
			
			System.out.println("Значение выражения равно \n " + z);
			
			System.out.println("Продолжить выполнение программы ? Да---1 / Нет---0 : ");
			
			String str1 = scannerString();
			
			if( str1.equals("0")) {
				
				break;
			}
			
		}
		
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

	public static double scannerDouble() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		double number;
	
		System.out.println("Введите число: \r");
	
		while(!in.hasNextDouble()) {
		
			in.next();
		
			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите число: \r");
		}
	
		number = in.nextDouble();
	
		return number;
	
	}

	public static String scannerString() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		String symbol;
	
		System.out.println("Введите символ: \r");
	
		while(!in.hasNextLine()) {
		
			in.next();
		
			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите символ (+, -, /, *) : \\r");
		}
		symbol = in.nextLine();
	
		return symbol;
	}
	}