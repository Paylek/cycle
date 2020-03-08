import java.util.Scanner;

public class cycle_28 {

	public static void main(String args[]) {
	
		
		System.out.println("28. �������� ���������, � ������� �������� ��� �������� � � Y � ���� �������� (+, �, /, *). ��������� \r\n" + 
				"��������� Z � ����������� �� �����. ������������� ������� �� ��������� �������� ���� ��������, � \r\n" + 
				"�����  ��  ����  Y=0  ���  �������.  ������������  �����������  ������������  ����������  ��� \r\n" + 
				"������������ ��������� (�.�. ��������� ����). � �������� ������� ����������� ���������� ������� \r\n" + 
				"�0�. ");
		
		for(;;) {
			
			System.out.println("������� �������� �: ");
			
			double x = scannerDouble();
			
			System.out.println("������� �������� Y: ");
			
			double y = scannerDouble();
		
			System.out.println("������� ������ �������� (+, -, /, *) :");
		
			String str = scannerString();
			
			System.out.println("�� ����� " + x + " " + str + " " + y);
		
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
						System.out.println("�� ���� ������ ������!");
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
					
					System.out.println("�� ����� �� ������������ ��������. ���������� ��� ���!");
			}
			
			System.out.println("�������� ��������� ����� \n " + z);
			
			System.out.println("���������� ���������� ��������� ? ��---1 / ���---0 : ");
			
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
		
		System.out.println("������� �����: \r");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("������������ ����!\r ");
			System.out.println("������� �����: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}

	public static double scannerDouble() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		double number;
	
		System.out.println("������� �����: \r");
	
		while(!in.hasNextDouble()) {
		
			in.next();
		
			System.out.println("������������ ����! \r");
			System.out.println("������� �����: \r");
		}
	
		number = in.nextDouble();
	
		return number;
	
	}

	public static String scannerString() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		String symbol;
	
		System.out.println("������� ������: \r");
	
		while(!in.hasNextLine()) {
		
			in.next();
		
			System.out.println("������������ ����! \r");
			System.out.println("������� ������ (+, -, /, *) : \\r");
		}
		symbol = in.nextLine();
	
		return symbol;
	}
	}