package javapractices;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList<Integer> l3 = new LinkedList<Integer>();

		l3.add(20);
		l3.add(40);
		l3.add(120);
		l3.add(null);
		l3.add(40);

		l3.add(3, 1500);
		System.out.println(l3);

		LinkedList<Integer> l4 = new LinkedList<Integer>();

		l4.add(70);
		l4.add(90);
		l4.add(60);
		System.out.println(l4);

		l3.addAll(l4);
		System.out.println(l3);

		System.out.println("#####################################");
		// Contains method return whether that list contains that element or not
		System.out.println(l3.contains(970));
		System.out.println(l3.containsAll(l4));

		System.out.println("###################################");

		LinkedList<Integer> l5 = new LinkedList<Integer>();
		l5.add(70);
		l5.add(90);
		l5.add(60);
		System.out.println(l3.containsAll(l5));

		System.out.println("###################################");

		System.out.println("Size of l3 list is = " + l3.size());
		System.out.println("###################################");

		System.out.println(l3.getFirst());
		System.out.println(l3.get(3));
		System.out.println("###################################");

		System.out.println(l3.subList(2, 6));
		System.out.println("###################################");

		System.out.println(l3.indexOf(70));

		ListIterator<Integer> listIterator = l3.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("############################@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
