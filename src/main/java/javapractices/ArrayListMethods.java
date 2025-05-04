package javapractices;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();

		l1.add(20);
		l1.add(30);
		System.out.println(l1);

		l1.add(1, 50);
		System.out.println(l1);

		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(20);
		l2.add(40);

		l1.addAll(l2);
		System.out.println(l1);

		// Returns the number of size of the elements in arraylist
		System.out.println("###########################################");
		System.out.println("Size of the array is = " + l1.size());

		// Returns true or false if that array contains that specific elements
		System.out.println("#####################################################3");
		System.out.println("L1 contains 50 = " + l1.contains(50));
		System.out.println("L1 contains L2" + l1.containsAll(l2));

		System.out.println("#######################################################");
		System.out.println(l1.get(2));

		System.out.println("#######################################################");
		System.out.println(l1.lastIndexOf(20));

		System.out.println("#########################################");
		System.out.println(l1.subList(1, 3));

		System.out.println("###########################################");

		Iterator<Integer> itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		l1.clear();
		System.out.println(l1);

	}

}
