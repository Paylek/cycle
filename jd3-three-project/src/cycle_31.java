public class cycle_31 {

	public static void main(String args[]) {
	
		System.out.println("31.  Компьютер  генерирует  пять  чисел  в  диапазоне  от  1  до  15  "
				+ "включительно.  Человек  пытается  их угадать.  "
				+ "Программа  должна  выводить  угаданные  и  неугаданные  числа  из  тех,  что "
				+ " сгенерировала программа, а также ошибочные числа пользователя. ");
		
	
			int a = 1 + (int)(Math.random() * 15);
			int b = 1 + (int)(Math.random() * 15);
			int c = 1 + (int)(Math.random() * 15);
			int d = 1 + (int)(Math.random() * 15);
			int e = 1 + (int)(Math.random() * 15);
			
			int user [] = new int[5];
			
			int i = 0;
			
			while(i <= 4) {
				
				int x = scannerInt();
					
				if(x == a) {
					
					System.out.println("Ура!Вы угадали цифру " + a);
				}
				
				if(x == b) {
					
					System.out.println("Ура!Вы угадали цифру " + b);
				}
				
				if(x == c) {
					
					System.out.println("Ура!Вы угадали цифру " + c);
				}
				
				if(x == d) {
					
					System.out.println("Ура!Вы угадали цифру " + d);
				}
				
				if(x == e) {
					
					System.out.println("Ура!Вы угадали цифру " + e);
				}
				
				user [i] = x;
				
				i++;
				
			}
				System.out.println("Числа предложенные игроком " );
			
				for(i = 0; i < 5; i++) {
				
					System.out.print(user[i] + " \\ ");
				}
				
			System.out.println("\nЧисла загаданные компьютером \n" + a + " \\ " + b + " \\ " + c + " \\ " + d + " \\ " + e + " \\ ");
			System.out.println();
		
	}

	private static int scannerInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	}