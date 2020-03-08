import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cycle_32 {

	public static void main(String args[]) {
		
		System.out.println("32.  Проверить  введенную  пользователем  строку  на  наличие  недопустимых"
				+ "  символов.  В  качестве первого  символа  допустимы  только  буквы  и  знак  "
				+ "подчеркивания.  Остальные  символы  могут  быть буквами, цифрами и знаком подчеркивания.");
		
		String str = scannerString();
		
		Pattern pattern = Pattern.compile("([a-zA-Z_])\\w*");
		
        Matcher matcher = pattern.matcher(str);
        
		boolean result1 = matcher.matches();
		
		if(result1 == true) {
			
			System.out.println("Вы правильно ввели строку");
		}
		else {
			
			System.out.println("Не корректный ввод. В качестве первого символа допустимы только "
					+ "буквы и знак подчеркивания. Остальные  символы  могут  быть буквами, цифрами "
					+ "и знаком подчеркивания.");
		}
		
		System.out.println();
		
		System.out.println(str);
		
	}

	public static String scannerString() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		String symbol;
	
		System.out.println("Введите символ: \r");
	
		while(!in.hasNextLine()) {
		
			in.next();
		
			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите символ (+, -, /, *) : \\r");
		}
		symbol = in.nextLine();
	
		return symbol;
	}
	}