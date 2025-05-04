package javapractices;

import java.util.LinkedHashSet;

public class LinkedHashsetImpl {

	public static void main(String[] args) {

		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		h1.add(20);
		h1.add(50);
		h1.add(70);
		h1.add(40);
		h1.add(90);
		h1.add(30);
		h1.add(null);

		System.out.println(h1);
		
		System.out.println("############################");

		for (Integer integer : h1) {
			System.out.println(integer);
		}

	}

}
