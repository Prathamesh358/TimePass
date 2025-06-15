package TestSample;

public class StringAddition {

	public static void main(String[] args) {

		String str = "au78rj";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				int digit = Integer.parseInt(Character.toString(str.charAt(i)));
				sum = sum + digit;

			}

		}
		System.out.println(sum);

	}

}
