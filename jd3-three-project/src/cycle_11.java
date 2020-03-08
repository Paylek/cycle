
public class cycle_11 {

	public static void main(String args[]) {
		
		int k = 8000000;
		
		for (int i = 199; i >= 0; i--) {
			k -= i * i * i;
		}
		
		System.out.print("k = " + k);
	}
	
}
