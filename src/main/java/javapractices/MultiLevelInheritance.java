package javapractices;


class Cycle{
	void sound() {
		System.out.println("Cycle horn : Tring Tring");
	}
}

class TwoWheeler1 extends Cycle{
	void sound() {
		System.out.println("Two-Wheeler horn : Pee-Pee");
	}
}

class FourWheeler1 extends TwoWheeler1{
	void sound() {
		System.out.println("Four-Wheeler horn : Poo-Poo");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
//		FourWheeler1 fWheeler1 = new FourWheeler1();
//		fWheeler1.sound();
		
		
		Cycle cycle = new FourWheeler1();
		cycle.sound();
		
	}

}
