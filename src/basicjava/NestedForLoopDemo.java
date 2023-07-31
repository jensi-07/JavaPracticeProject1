package basicjava;

import java.util.Scanner;

public class NestedForLoopDemo {

	public static void main(String[] args) {
	

//		char last = 'D', alphabet = 'A';
//		
//		for(int i=1; i<=(last - 'A'+1);i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(alphabet + "\t");
//			}
//			alphabet++;
//			System.out.println( );
//		}
//		
//		int end = 4 , number = 1;
//		for(int a=1; a<=(end-1+1); a++) {
//			for(int b=1; b<=a; b++) {
//				System.out.print(number + "\t");
//				
//			}
//			number++;
//			System.out.println( );
//			}
		int end = 6, number = 1;
		char c = 'A';
		for(int i=1; i<(end-1+1); i++) {
			for(int j=1; j<=i; j++) {
				if(i%2==0) {
					System.out.print((char)(c+i-1) + "\t");
					
				}else {
					
				System.out.print(number + "\t");
				
				}
			}
			number++;
			System.out.println( );
		
		
		
		
		
		
		
	}

	}
	}
