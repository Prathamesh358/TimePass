package javapractices;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(10);
		l2.add(50);
		l2.add(80);
		l2.add(null);
		l2.add(50);
		l2.add(12);

		System.out.println(l2);

		for (Integer integer : l2) {
			System.out.println(integer);
		}

		System.out.println("###################################");

		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}

		System.out.println("###################################");

		Iterator<Integer> itr1 = l2.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
