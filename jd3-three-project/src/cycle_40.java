public class cycle_40 {

	public static void main(String args[]) {
		
		System.out.println("40. �������� ��� �����, �� ����������� ��������� ����� N, ������� �������"
				+ " ��� ������� �� ��� ���� �����.");
		
		int n = 123;//������������ �����
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
				
				count++; //������� ���������� ���� � �����
				
				b = a % 10;
				
				c = c * b; // ������� ������������ ��� ����
				
				a = a / 10;
			}
			
			if (c != 0) { //���� ������������ ����� 0 �� � ����� ���� ����� 0, �� ���� ������ ������
				
				int count1 = 0;
				
				while(x != 0) {
					
					y = x % 10;
					
					
					if(x % y == 0) {
						
						count1 ++;
						
					}
					
					x = x / 10;
				}
				
				if(count == count1) { // ���������� ���������� ���� � ����� � ���������� ���������
					
					System.out.println("��� ����� :" + i);
				}
			}
			else {
				
				System.out.println("� ����� ����� ���� ����� 0, �� 0 ������ ������: " + i);
			}
			
		}
		
		System.out.println();
		
	}
	}