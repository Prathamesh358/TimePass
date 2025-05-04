package javapractices;

interface Mobile {

	public static final int a = 20;

	public abstract void switchOn();

	public abstract void switchOff();

	void ringtone();

}

class SmartPhone implements Mobile {

	public void switchOn() {
		System.out.println("Tunrning on the phone");
	}

	public void switchOff() {
		System.out.println("Turning off the Phone");
	}

	public void ringtone() {
		System.out.println("IPhone Ringtone");
	}

	public void keypad() {
		System.out.println(" 1 2 3 4 5 6 7 8 9");
	}

	public void camera() {
		System.out.println("Khichikk");
	}

}

public class Interface {

	public static void main(String[] args) {

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.camera();
		smartPhone.keypad();

//		Mobile mobile = new SmartPhone();
//		System.out.println(mobile.a);

	}

}
