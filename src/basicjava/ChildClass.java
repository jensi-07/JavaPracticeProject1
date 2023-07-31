package basicjava;

public class ChildClass extends ParentClass{
int i = 20;
	public void colour() {
		System.out.println(colour);
	}
	
		
		
	
	
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		//ParentClass cc = new ChildClass();
		
		
		cc.brakes();
		//cc.colour();
		cc.gear();
		System.out.println(cc.i);

	}

}
