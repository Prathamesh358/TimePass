package javapractices;

import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<Integer>();

		v1.add(20);
		v1.add(50);
		v1.add(40);
		v1.add(null);
		v1.add(20);

		System.out.println(v1);
		System.out.println("######################################");

		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));

		}

	}

}
