package javapractices;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMethods {

	public static void main(String[] args) {

		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		h1.add(20);
		h1.add(30);
		h1.add(50);

		LinkedHashSet<Integer> h2 = new LinkedHashSet<Integer>();
		h2.add(2);
		h2.add(3);
		h2.add(5);

		System.out.println(h1);
		h1.addAll(h2);
		System.out.println(h1);

		Iterator<Integer> i1 = h1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println(h1.contains(8));

		System.out.println(h1.containsAll((h2)));

		System.out.println(h1.isEmpty());

		System.out.println(h1.remove(5));

		System.out.println(h1.size());

	}

}
