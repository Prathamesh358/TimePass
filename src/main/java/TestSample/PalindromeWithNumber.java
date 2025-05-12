package TestSample;

public class PalindromeWithNumber {

	public static void main(String[] args) {

		// is 1231 a palindrome or not.

		int original = 1231;
		int number = original;
		int reverse = 0;

		while (number != 0) {

			int digit = number % 10;
			reverse = reverse * 10 + digit; // 1321
			number = number / 10;

		}

		if (original == reverse) {
			System.out.println("number 1231 is palindrome");
		} else {
			System.out.println("Number 1231 is not a palindrome");
		}

	}

}
