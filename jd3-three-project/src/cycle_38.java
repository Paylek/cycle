public class cycle_38 {

	public static void main(String args[]) {
		
		System.out.println("38.  Для  заданного  натурального  числа  определить,  образуют  ли "
				+ " его  цифры  арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр."
				+ " Например: 1357, 963.");
		
		int n = 1357;
		
		int num = n;
		
		int x;
		
		int count = 0;
		
		while(num != 0) { // находим количество цифр в числе
			
			x = num % 10;
			
			count++;
			
			num = num / 10;
		}
		
		int [] element = new int [count]; // создаем массив размером равным количеству цифр числа
		
		int i = 0;
		
		while(i < count) { // заполняем массив цифрами числа
			
			x = n % 10;
			
			element[i] = x;
			
			n = n / 10;
			
			i++;
		}
		
		int sum = 0;
		
		for(int j = 0; j < count; j++) { //находим сумму цифр числа
			
	        sum = sum + element[j];
	    }
		
		int sum1 = ((element[0] + element[count - 1]) / 2) * count; // сумма n членов арефметической прогрессии 
		
		if(sum == sum1) {
			
			System.out.println("Цифры вашего числа составляют арефметическую прогрессию !");
		}
		else {
			
			System.out.println("Цифры вашего числа не составляют арефметическую прогрессию !");
		}
		
		System.out.println();	
		
	}
	}