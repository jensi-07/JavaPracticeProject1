package basicjava;

public class InterviewQueFindMinNum {

	public static void main(String[] args) {
	int a[][] = {{2,3,4},{4,5,6},{1,2,3}};
	
	int min= a[0][0];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(a[i][j]<min) {
				min=a[i][j];
				
			}
			
		}
		
	}
	System.out.println(min);
	}

	
}
