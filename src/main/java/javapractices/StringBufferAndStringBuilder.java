package javapractices;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Welcome to Codemind");
		
		s.reverse();
		System.out.println(s);
		
		StringBuilder b = new StringBuilder("Welcome to Codemind");
		b.reverse();
		System.out.println(b);
		
		
		String s1 = "Welcome to Shrekha Rubbers";
		String str= s1.concat(" Hello");
		System.out.println(str);
		System.out.println(s1);
		
	}

}
