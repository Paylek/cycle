public class cycle_08 {

public static void main(String args[]) {
	int k = 0, c = 3;
	
	for (int i = -5; i <= 5; i++) {
		if (i == 15) {
			k += (i + c) * 2;
		}
		else {
			k += (i - c) + 6;
		}
	}
	
	System.out.print("k = " + k);
	
	}
}