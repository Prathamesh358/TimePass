package javapractices;

public class StringExample {

	public static void main(String[] args) {

		String s = "Welcome to Shrekha Rubbers";
		System.out.println(s);

		System.out.println(s.charAt(4));

		System.out.println(s.concat(" hello..!"));

		System.out.println(s.length());

		System.out.println(s.compareTo("technology"));

		System.out.println(s.compareToIgnoreCase("technology"));

		System.out.println(s.compareTo("welcome to shrekha rubbers"));

		System.out.println(s.compareToIgnoreCase("welcome to shrekha rubbers"));

		System.out.println(s.contains(" to "));

		System.out.println(s.endsWith("Rubbers"));

		System.out.println(s.equals("Welcome to Shrekha Rubbers"));

		System.out.println(s.equalsIgnoreCase("welcome to shrekha rubbers"));

		System.out.println(s.indexOf("o"));

		System.out.println(s.indexOf("Rubbers"));

		System.out.println(s.indexOf("e", 12));

		System.out.println("".isEmpty());

		System.out.println("  ".isEmpty());

		System.out.println(s.lastIndexOf("e"));

		System.out.println(s.replace("e", "o"));

		String ss = "11FDG$%$dfhgfh324";

		System.out.println(ss.replaceAll("[^A-Z]", ""));

		System.out.println(ss.replaceFirst("[FD]", "99"));

		String a[] = s.split(" ");

		for (String sss : a) {

			System.out.println(sss);
		}

		System.out.println(s.startsWith("welcome"));

		System.out.println(s.substring(11));

		System.out.println(s.substring(11, 17));

		char arr[] = s.toCharArray();

		for (char c : arr) {
			System.out.print(c);
		}

		System.out.println();
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String sss = "      Welcome     to  codemind     ";
		System.out.println(sss.trim());

		int aa = 10;
		String ssss = String.valueOf(aa);
		System.out.println(ssss.length());

		boolean b = true;
		String t = String.valueOf(b);
		System.out.println(t.length());

	}

}
