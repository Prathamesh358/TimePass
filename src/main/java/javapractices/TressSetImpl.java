package javapractices;

import java.util.TreeSet;

public class TressSetImpl {

	/*
	 * 1. It is the child class of theSet interface and also the sorted set interface.
	 * 2. It doesn't allow duplicate insertion. 
	 * 3. It doesn't allow null insertion. 
	 * 4. It stores the collection in ascending order.
	 * 5. It is synchronous thats why it is thread safe.
	 */

	public static void main(String[] args) {

		TreeSet<Integer> t1 = new TreeSet<Integer>();

		t1.add(10);
		t1.add(20);
		t1.add(50);
		t1.add(70);
//		t1.add(null);    Null is not allowed in tree set collection.

		System.out.println(t1);

		for (Integer i : t1) {
			System.out.println(i);
		}

	}

}
