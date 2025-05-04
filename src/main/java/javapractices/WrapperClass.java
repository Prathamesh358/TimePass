package javapractices;


public class WrapperClass {

	public void intDemo() {

		// Boxing primitive to wrapper

		int a = 20;

		Integer b = Integer.valueOf(a);
		System.out.println(b);
		System.out.println(b instanceof Integer);

		// Un-Boxing wrapper to primitive

		int dd = b;
		System.out.println(dd);

		String price = "$3,456";

		System.out.println(price);

		price = price.replaceAll("[^0-9]", "");

		System.out.println(price);

		Integer num = Integer.parseInt(price);

		System.out.println(num + 10);
		System.out.println(num instanceof Integer);
	}

	public void charPro() {

		// Welcome To Codemind Technology Maharashtra Pune

		String s = "Welcome to codemind" + " Technology pune" + " maharashtra";
		String ss = "";

		for (int i = 0; i < s.length(); i++) {

			if (Character.isSpace(s.charAt(i))) {

				char cc = Character.toUpperCase(s.charAt(i + 1));
				ss = ss + " " + cc;
				i = i + 1;
				continue;

			}
			ss = ss + s.charAt(i);
		}

		System.out.println(ss);

	}

	public void charrPro() {

		String n = " Welcome to \n " + "codemind technology \n " + "maharashtra pune";

		System.out.println(n);
		System.out.println("###################################################");

		String sss = "";

		for (int i = 0; i < n.length(); i++) {

			if (Character.isSpace(n.charAt(i))) {

				char ccc = Character.toUpperCase(n.charAt(i + 1));

				sss = sss + " " + ccc;
				i = i + 1;
				continue;
			}

			sss = sss + n.charAt(i);
		}
		System.out.println(sss);

	}

	public static void main(String[] args) {
		WrapperClass wrapperClass = new WrapperClass();

//		wrapperClass.intDemo();

//		wrapperClass.charPro();

		wrapperClass.charrPro();

	}

}
