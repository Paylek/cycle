public class cycle_29 {

	public static void main(String args[]) {
		
		System.out.println("29. ���� ��� �����. ���������� �����, �������� � ������ ��� ������� "
				+ "��� � ������� �����.");
		
		int a;
		int b;
		int x;
	
		a = 23654;//������������ ��������
		b = 12345;//������������ ��������
		
		String str1 = String.valueOf(b);
		
		System.out.println("� ������ ������� � ������� ����� ������ ����� ");
		
		while (a != 0) {
			
			x = a % 10;
			
			String str2 = String.valueOf(x);
			
			
			
			if(str1.indexOf(str2) != -1) {
				
				System.out.print(x + " ");
			}
				
			a = a / 10;
		}
		
		System.out.println();
		
	}
	}