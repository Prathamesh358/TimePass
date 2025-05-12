package TestSample;

public class PalindromeOfTheString {

	public static void main(String[] args) {

		String org = "radar";
		String s = org;
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		if (org.equals(rev)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("String is not a plaindrome");
		}

	}

}
