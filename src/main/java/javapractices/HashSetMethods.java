package javapractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {

		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(30);
		h1.add(50);
		h1.add(70);
		h1.add(390);
		h1.add(20);
		h1.add(null);
		h1.add(null);

		HashSet<Integer> h2 = new HashSet<Integer>();
		h2.add(3);
		h2.add(5);
		h2.add(7);
		h2.add(5);

		System.out.println(h1);

		System.out.println("#################################");
		System.out.println(h1.contains(5));
		System.out.println(h1.containsAll(h2));

		System.out.println("#####################################");
		h1.addAll(h2);
		System.out.println(h1.containsAll(h2));

		System.out.println("##################################");
		System.out.println(h1.isEmpty());

		System.out.println("##################################");

		Iterator<Integer> iterator = h1.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("###############################");

		for (Integer integer : h1) {
			System.out.println(integer);
		}
	}

}
