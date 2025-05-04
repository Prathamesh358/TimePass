package javapractices;

public class StringExp2 {

	public static void main(String[] args) {

//		String q = "kumbharprathamesh19@gmail.com";
//
//		String q1 = q.substring(0, 19);
//
//		String q2[] = q.split("@");
//
//		String q3 = q2[1];
//
//		for (int i = q1.length() - 1; i >= 0; i--) {
//			System.out.print(q1.charAt(i));
//		}
//
//		System.out.println("@" + q3);

		String b = "Welcome to Codemind";

		String ss = "";

		int count = 1;

		for (int i = 0; i < b.length(); i++) {

			if (!(ss.contains(String.valueOf(b.charAt(i))))) {

				for (int j = i + 1; j < b.length(); j++) {
					if (b.charAt(i) == b.charAt(j)) {
						count++;
					}

				}
				System.out.println(b.charAt(i) + " = " + count);
				ss = ss + b.charAt(i);
				count = 1;

			}

		}

	}
}
