public class cycle_38 {

	public static void main(String args[]) {
		
		System.out.println("38.  ���  ���������  ������������  �����  ����������,  ��������  �� "
				+ " ���  �����  �������������� ����������. ��������������, ��� � ����� �� ����� ��� ����."
				+ " ��������: 1357, 963.");
		
		int n = 1357;
		
		int num = n;
		
		int x;
		
		int count = 0;
		
		while(num != 0) { // ������� ���������� ���� � �����
			
			x = num % 10;
			
			count++;
			
			num = num / 10;
		}
		
		int [] element = new int [count]; // ������� ������ �������� ������ ���������� ���� �����
		
		int i = 0;
		
		while(i < count) { // ��������� ������ ������� �����
			
			x = n % 10;
			
			element[i] = x;
			
			n = n / 10;
			
			i++;
		}
		
		int sum = 0;
		
		for(int j = 0; j < count; j++) { //������� ����� ���� �����
			
	        sum = sum + element[j];
	    }
		
		int sum1 = ((element[0] + element[count - 1]) / 2) * count; // ����� n ������ �������������� ���������� 
		
		if(sum == sum1) {
			
			System.out.println("����� ������ ����� ���������� �������������� ���������� !");
		}
		else {
			
			System.out.println("����� ������ ����� �� ���������� �������������� ���������� !");
		}
		
		System.out.println();	
		
	}
	}