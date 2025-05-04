package TestSample;

//import javapractices.GenericUtils;
//import javapractices.MathUtils;

//import javapractices.*;

public class ExampleOfPackgaes {

	public void run() {
		System.out.println("I am running");
	}

	public static void main(String[] args) {

		javapractices.MathUtils mathUtils = new javapractices.MathUtils();
		System.out.println(mathUtils.add(10, 20));

		javapractices.GenericUtils gUtils = new javapractices.GenericUtils();
		gUtils.print();

	}

}
