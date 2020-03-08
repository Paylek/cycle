
public class cycle_10 {

	public static void main(String args[]) {
		
		int k = 1;
		
		for (int i = 0; i <= 200; i++) {
			k += i * (i + 1);
		}
		
		System.out.print("k = " + k);
	}
	
}
