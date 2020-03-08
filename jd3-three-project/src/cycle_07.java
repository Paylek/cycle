public class cycle_07 {

public static void main(String args[]) {
	int k = 0;
	
	for (int i = -5; i <= 5; i++) {
		if (i <= 2) {
			k += -i;
		}
		else {
			k += i;
		}
	}
	
	System.out.print("k = " + k);
	
	}
}