import java.util.Scanner;

public class cycle_33 {

	public static void main(String args[]) {
	
System.out.println("33. ������� ���������� ����� ������� ������������ �����.");
		
		int n = scannerInt();
		
		System.out.println("�� ����� " + n);
		
		int num = n;
		
		int x;
		
		int count = (num == 0) ? 1 : 0;
		
        while (num != 0) {
        	
            count++;
            
            num = num / 10;
        }
        
        System.out.println("���������� ���� " + count);
        
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
		
        System.out.println("���������� ����� � �����  ����� " + max);
        
        System.out.println();
		
	}
	
public static int scannerInt() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int number;
		
		System.out.println("������� �����: \r");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("������������ ����!\r ");
			System.out.println("������� �����: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}
}