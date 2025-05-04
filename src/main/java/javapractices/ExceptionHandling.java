package javapractices;

class Mathematics {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void div(int a, int b) {
		
		int c = 0;
		
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Dont Divide by 0");
		}

		System.out.println(c);

		System.out.println("####################");

		System.out.println("remaining code");
	}

}

public class ExceptionHandling {

	public static void main(String[] args) {
		Mathematics mathematics = new Mathematics();
		mathematics.div(10, 0);
	}

}
