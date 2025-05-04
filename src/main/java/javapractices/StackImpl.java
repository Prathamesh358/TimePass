package javapractices;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.add(10);
		s.add(20);
		s.add(10);
		s.add(null);
		s.add(null);
		s.add(200);

		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		System.out.println("######################################3");

		System.out.println(s.peek());
		System.out.println(s);

		System.out.println("#####################################");

		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println("###########################");
		
		System.out.println(s.push(34));
		System.out.println(s);

	}

}
