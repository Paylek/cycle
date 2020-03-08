public class cycle_26 {

	public static void main(String args[]) {
		
		System.out.println("26. Вывести  на  экран  соответствий  между  символами  и  их  численными"
				+ "  обозначениями  в  памяти компьютера (Таблицу ASCII).");
		
		double i = 0;
		
		char ch;
		
		while(i <= 255) {
			
			ch = (char) i;
			
			System.out.println("Символ--- " + ch + " соответствует числовому коду " + i);
			
			i++;
		}
		
		System.out.println();
		
	}
}