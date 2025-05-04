package javapractices;


abstract class Bicycle{
	public void run() {
		System.out.println("Cycling is done");
	}
	
	abstract void horn();
	
	abstract void stop();
	
}

class TwoWheeler2 extends Bicycle{
	
	public void indicator() {
		System.out.println("Blinking Indicator");
	}
	
	public void horn() {
		System.out.println("Pee-Pee");
	}

	public void stop() {
		System.out.println("Brakeee please");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		TwoWheeler2 twoWheeler2 = new TwoWheeler2();
		twoWheeler2.run();

	}

}
