package javapractices;

class HappyMind {

	public int getNumber(int a) {
		int arr[] = { 10, 20, 30, 60 };
		int s = 0;
		try {
			s = arr[a];
		} catch (ArithmeticException e) {
			System.out.println("Please enter the valid index for array");
		} catch (NumberFormatException e) {
			System.out.println("Number not in proper format");
		} catch (NullPointerException e) {
			System.out.println("dont put null values");
		} catch (RuntimeException e) {
			System.out.println("please enter valid index");
		}

		finally {
			int d = 20 + 30;
			System.out.println("This is the code of finally block");
			System.out.println(d);
		}

		System.out.println(s);

		System.out.println("remaining code ");
		System.out.println("is yet to be executed");
		return s;

	}

}

public class IndexOutOfBond {

	public static void main(String[] args) {

		HappyMind happyMind = new HappyMind();
		happyMind.getNumber(4);

	}

}
