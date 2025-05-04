package javapractices;

public class StringPrograms {

	public static void main(String[] args) {

		// Welcome to Codemind
		// dnimedoC ot emocleW

		String a = "Welcome to Codemind";

//		for(int i = a.length()-1; i>=0 ; i--) {
//			System.out.print(a.charAt(i));
//		}

//		String arr[] = a.split(" ");
//		
//		for(String l : arr) {
//			for(int i = l.length()-1; i>=0 ; i--) {
//				System.out.print(l.charAt(i));
//			}
//			System.out.print(" ");	
//		}

		String arr[] = a.split(" ");

		for (String s : arr) {

			if (!(s.equals("Codemind"))) {
				for (int i = s.length() - 1; i >= 0; i--) {
					System.out.print(s.charAt(i));
				}

			} else {
				System.out.print(s);
			}
			System.out.print(" ");
		}

	}

}
