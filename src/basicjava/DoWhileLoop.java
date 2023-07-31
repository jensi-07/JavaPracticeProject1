package basicjava;

public class DoWhileLoop {

	public static void main(String[] args) {
	
		//do-while loop: first execution will be execute guarantee
		    //              do not get infinite loop
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		
		int j = 10;
		do {
			System.out.println(j);
			j--;
		}while(j>40);
		
		
		
		

	}

}
