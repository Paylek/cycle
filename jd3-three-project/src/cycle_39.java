public class cycle_39 {

	public static void main(String args[]) {
		
		System.out.println("39.  �  �����������  �����  ����������  �������  �����.  �����  ����������  "
				+ "�����  ��������  ��  7,  �� �������� �������� �����. ����� ��� �����. ");
		
		int n;
		
		for(n = 100; n <= 999; n++) {
			
			if(n == 7 * (n % 100)) {
				
				System.out.println("��� ����� " + n);
			}
		}
		
		System.out.println();
		
	}
	}