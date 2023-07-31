package basicjava;

public class MaxNumMultiDirectionalArray {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int highest = a[0][0];
		int SecHighest = a[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(a[i][j]>highest) {
					SecHighest=highest;
					highest=a[i][j];
				}
				if(a[i][j]<highest && a[i][j]>SecHighest) {
					SecHighest = a[i][j];
				}
			}
}System.out.println(SecHighest);
	}
}