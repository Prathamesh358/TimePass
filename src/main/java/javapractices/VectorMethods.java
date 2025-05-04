package javapractices;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {

		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(20);
		v2.add(90);
		v2.add(70);

		System.out.println(v2);

		v2.add(3, 40);
		System.out.println(v2);

		Vector<Integer> v3 = new Vector<Integer>();
		v3.add(55);
		v3.add(66);
		v3.add(99);
		v3.addElement(null);

//		v2.addAll(v3);
//		System.out.println(v2);

		v2.addAll(v3);
		System.out.println(v2);

		Enumeration<Integer> vr = v2.elements();

		while (vr.hasMoreElements()) {
			System.out.println(vr.nextElement());
		}

	}

}
