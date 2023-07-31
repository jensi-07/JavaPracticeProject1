package basicjava;

public class GeneralTrafficRules implements LocalTrafficRules {

	public static void main(String[] args) {
		LocalTrafficRules ltr = new GeneralTrafficRules();
		ltr.stopOnRed();
		ltr.causionOnYellow();
		ltr.GoGreen();

	}

	@Override
	public void GoGreen() {
		System.out.println("move on green");
		
	}

	@Override
	public void stopOnRed() {
		System.out.println("stop on red");
		
	}

	@Override
	public void causionOnYellow() {
		System.out.println("be causious on yellow signal");
		
	}

}
