package basicjava;

public class NestedForLoop {

	public static void main(String[] args) {
		
//	for(int i=1;i<=4;i++)
//	{System.out.println(i);
//		for(int j=1; j<=4; j++)
//		{System.out.println(j);
//			
//		}
//	}
	
//	for(int a=1; a<=4; a++) {
//		System.out.print(a);
//	}System.out.println();
//	for(int b=5; b<=7; b++) {
//		System.out.print(b);
//	}System.out.println();
//	for(int c=8; c<=9; c++) {
//		System.out.print(c);
//	}System.out.println();
//	int d = 10;
//	System.out.println(d);
//	int k = 1;
//		for(int i=3; i>=0; i--)
//		{
//			
//			for(int j=1; j<=4-i; j++) 
//			{
//				System.out.print(k);
//				System.out.print("\t");
//			k++;
//				
//			}
//			System.out.println(" " );
//		}
//		int c = 1;
//		for(int a=0; a<4; a++)
//		{
//			
//			for(int b=1; b<=4-a; b++) 
//			{
//				System.out.print(c);
//				System.out.print("\t");
//			c++;
//				
//			}
//			System.out.println(" " );
//		}
//		int z = 3;
//		for(int x = 3; x>=0; x--) {
//			for(int y=1; y<=4-x; y++) {
//				System.out.print(z);
//				System.out.print("\t");
//			z=z+3;
//			}
//			System.out.println(" ");
//		}
//	
//	}
	int rows = 5;
	for(int i=1;i<=rows; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*" + "\t");
		}
		System.out.println( );
	}
	
	int Rows = 5;
	for(int i=Rows;i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print("*" + "\t");
		}
		System.out.println( );
	}
	
	
	
	}
	
	}
