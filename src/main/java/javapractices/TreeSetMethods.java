package javapractices;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {

		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(20);
		t1.add(80);
		t1.add(90);

		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(22);
		t2.add(84);
		t2.add(97);

		t1.addAll(t2);

		System.out.println(t1);
		System.out.println("#################################");

		System.out.println(t1.contains(84));

		System.out.println("###############################");
		System.out.println(t1.containsAll(t2));

		System.out.println("##############################");
		System.out.println(t1.first());

		System.out.println("###############################");
		System.out.println(t1.size());

		System.out.println(t1.subSet(22, 84));

		Iterator<Integer> e1 = t1.iterator();

		while (e1.hasNext()) {
			System.out.println(e1.next());
		}

	}

}
