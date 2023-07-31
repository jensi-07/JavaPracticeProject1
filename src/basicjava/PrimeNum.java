package basicjava;

public class PrimeNum {

	public static void main(String[] args) {
		for (int i = 2; i < 15; i++) {
			boolean flag = false;
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					flag = true;

				}
			}
			if (flag != true ) {
				System.out.println(i);
			}

		}

	}
}