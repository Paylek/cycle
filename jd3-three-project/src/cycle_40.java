public class cycle_40 {

	public static void main(String args[]) {
		
		System.out.println("40. Получить все числа, не превышающие заданного числа N, которые делятся"
				+ " без остатка на все свои цифры.");
		
		int n = 123;//произвольное число
		int a;
		int i;
		int x;
		int y;
		
		for(i = 1; i <= n; i++) {
			
			x = i;
			a = i;
			
			int b;
			int c = 1;
			
			int count = 0;
			
			while(a != 0) {
				
				count++; //считаем количество цифр в числе
				
				b = a % 10;
				
				c = c * b; // находим произведение его цифр
				
				a = a / 10;
			}
			
			if (c != 0) { //если произведение равно 0 то в числе есть цифра 0, на ноль делить нельзя
				
				int count1 = 0;
				
				while(x != 0) {
					
					y = x % 10;
					
					
					if(x % y == 0) {
						
						count1 ++;
						
					}
					
					x = x / 10;
				}
				
				if(count == count1) { // сравниваем количество цифр в числе и количество делителей
					
					System.out.println("Это число :" + i);
				}
			}
			else {
				
				System.out.println("У этого числа есть цифра 0, на 0 делить нельзя: " + i);
			}
			
		}
		
		System.out.println();
		
	}
	}