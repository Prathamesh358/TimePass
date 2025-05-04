package javapractices;

class Vehicle{
	void horn() {
		System.out.println("Pee-Pee");
	}
	
	void lights() {
		System.out.println("Turn-ON");
	}
}


class TwoWheeler extends Vehicle{
	void changeGearTwoWheeler() {
		System.out.println("Change the gear of Two-Wheeler");
	}
}

class FourWheeler extends Vehicle{
	void changeGearFourWheeler() {
		System.out.println("Change the gear of Four-Wheeler");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		FourWheeler fWheeler = new FourWheeler();
		fWheeler.lights();
		System.out.println();
		fWheeler.changeGearFourWheeler();
		System.out.println();
		
		
		TwoWheeler tw = new TwoWheeler();
		tw.changeGearTwoWheeler();
		

	}

}
