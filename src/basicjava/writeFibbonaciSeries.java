package basicjava;

public class writeFibbonaciSeries {

	public static void main(String[] args) {
	
		
		int a=0;
		int b=1;
		int total = 10;
		
		for(int i=0;i<total;i++) {
			System.out.println(a );
			int c = a+b;
			a = b;
			b = c;
			
		}
}
}