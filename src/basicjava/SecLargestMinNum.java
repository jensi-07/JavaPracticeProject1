package basicjava;

public class SecLargestMinNum {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{1,4,5},{4,1,6}};
		int lowest = a[0][0];
		int secLowest = a[0][0];

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]<lowest) {
					secLowest = lowest;
					lowest = a[i][j];
					
				}
				if(a[i][j]<lowest && a[i][j]>secLowest) {
					
				}
			}
		}System.out.println(secLowest);

	}

}
