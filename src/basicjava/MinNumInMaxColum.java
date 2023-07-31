package basicjava;

public class MinNumInMaxColum {

	public static void main(String[] args) {
		
		
		int a[][]= {{1,2,3},{10,1,0},{2,20,5}};
		
		int max = a[0][0];
		int maxcolumn = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				 maxcolumn = j;
				
				}
				
			}
		}
		int min=a[0][maxcolumn];
int k=0;
while(k<3) {
	if(a[k][maxcolumn]<min) {
		min=a[k][maxcolumn];
	}
	k++;
}
System.out.println(min);
	}

}
