public class cycle_27 {

	public static void main(String args[]) {
		
		System.out.println("27. ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������,"
				+ " ����� ������� � ������ �����. m � n �������� � ����������. ");
		
		double m = scannerInt();
		double n = scannerInt();
		int x = 0;
		
		while(m <= n) {
			
			System.out.println("�������� ����� " + m);
			System.out.println("1 � " + m);
			
			int i = 2;
			while( i <= (m - 1)) {
				
				if(m % i == 0 ) {
					
					 x = i;
					System.out.print(" " + x + " \n");
				}
				
				i++;	
			}
			
			m++;
							
		}
		
		System.out.println();
		
	}

	private static double scannerInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}