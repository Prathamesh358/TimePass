package javapractices;

import java.util.PriorityQueue;

public class QueueMethods {
	
	/*
	1. Queue is the child interface of collection interface
	2. Queue allows duplicate insertions
	3. Queue maintains insertion order of collection.
	4. Queue doesn't allow null insertion.
	5. Queue uses Queue or linear as a data structure in backend.
			(i.e. FIFO(First In First Out)).
	*/

	public static void main(String[] args) throws NullPointerException {

		PriorityQueue<Integer> l3 = new PriorityQueue<Integer>();

		l3.add(20);
		l3.add(40);
		l3.add(120);
		l3.add(40);
		try {
			l3.add(null);
		} catch (Exception e) {
			System.out.println("please dont put null value");
		}
		System.out.println("####################################");

		System.out.println(l3);

		PriorityQueue<Integer> l4 = new PriorityQueue<Integer>();

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

		PriorityQueue<Integer> l5 = new PriorityQueue<Integer>();
		l5.add(70);
		l5.add(90);
		l5.add(60);
		System.out.println(l3.containsAll(l5));

		System.out.println("###################################");

		System.out.println("Size of l3 list is = " + l3.size());

		System.out.println("############################@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		for (Integer integer : l3) {
			System.out.println(integer);
		}

	}

}
