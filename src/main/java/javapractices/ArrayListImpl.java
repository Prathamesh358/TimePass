package javapractices;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();

		l1.add(20);
		l1.add(90);
		l1.add(30);
		l1.add(50);
		l1.add(null);
		l1.add(100);
		l1.add(20);
		l1.add(99);

		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i));
			System.out.print(" ");
		}

	}

}
