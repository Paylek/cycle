public class cycle_26 {

	public static void main(String args[]) {
		
		System.out.println("26. �������  ��  �����  ������������  �����  ���������  �  ��  ����������"
				+ "  �������������  �  ������ ���������� (������� ASCII).");
		
		double i = 0;
		
		char ch;
		
		while(i <= 255) {
			
			ch = (char) i;
			
			System.out.println("������--- " + ch + " ������������� ��������� ���� " + i);
			
			i++;
		}
		
		System.out.println();
		
	}
}