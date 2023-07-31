package basicjava;

public class SwapNumbers {

	public static void main(String[] args) {
	int a = 5;
	int b = 3;
	//System.out.println(a+" "+b);
	
//	int c = a;
//	a = b;
//b = c;

//System.out.println(a+""+b+""+c);
//System.out.println(a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+""+b);

	}

}
