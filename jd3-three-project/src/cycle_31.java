public class cycle_31 {

	public static void main(String args[]) {
	
		System.out.println("31.  ���������  ����������  ����  �����  �  ���������  ��  1  ��  15  "
				+ "������������.  �������  ��������  �� �������.  "
				+ "���������  ������  ��������  ���������  �  �����������  �����  ��  ���,  ��� "
				+ " ������������� ���������, � ����� ��������� ����� ������������. ");
		
	
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
					
					System.out.println("���!�� ������� ����� " + a);
				}
				
				if(x == b) {
					
					System.out.println("���!�� ������� ����� " + b);
				}
				
				if(x == c) {
					
					System.out.println("���!�� ������� ����� " + c);
				}
				
				if(x == d) {
					
					System.out.println("���!�� ������� ����� " + d);
				}
				
				if(x == e) {
					
					System.out.println("���!�� ������� ����� " + e);
				}
				
				user [i] = x;
				
				i++;
				
			}
				System.out.println("����� ������������ ������� " );
			
				for(i = 0; i < 5; i++) {
				
					System.out.print(user[i] + " \\ ");
				}
				
			System.out.println("\n����� ���������� ����������� \n" + a + " \\ " + b + " \\ " + c + " \\ " + d + " \\ " + e + " \\ ");
			System.out.println();
		
	}

	private static int scannerInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	}