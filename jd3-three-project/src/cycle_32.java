import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cycle_32 {

	public static void main(String args[]) {
		
		System.out.println("32.  ���������  ���������  �������������  ������  ��  �������  ������������"
				+ "  ��������.  �  �������� �������  �������  ���������  ������  �����  �  ����  "
				+ "�������������.  ���������  �������  �����  ���� �������, ������� � ������ �������������.");
		
		String str = scannerString();
		
		Pattern pattern = Pattern.compile("([a-zA-Z_])\\w*");
		
        Matcher matcher = pattern.matcher(str);
        
		boolean result1 = matcher.matches();
		
		if(result1 == true) {
			
			System.out.println("�� ��������� ����� ������");
		}
		else {
			
			System.out.println("�� ���������� ����. � �������� ������� ������� ��������� ������ "
					+ "����� � ���� �������������. ���������  �������  �����  ���� �������, ������� "
					+ "� ������ �������������.");
		}
		
		System.out.println();
		
		System.out.println(str);
		
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