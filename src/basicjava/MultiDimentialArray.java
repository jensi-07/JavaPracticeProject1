package basicjava;

public class MultiDimentialArray {

	public static void main(String[] args) {
		//int a[][] = new int[2][2];
		int b[][] = {{1,2,3},{3,4,5},{4,5,6}};
//System.out.println(b[2][2]);
for(int i=0; i<=2; i++) {
	for(int j=0; j<3; j++) {
		System.out.println(b[i][j]);
		
	}
}
	}

}
