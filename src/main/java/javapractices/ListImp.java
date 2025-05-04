package javapractices;

import java.util.List;
import java.util.ArrayList;

public class ListImp {

	public static void main(String[] args) {

		// heteregenous elements are allowed we never use it in realtime
		
		
//		List l1 = new ArrayList();
//		
//		l1.add(20);
//		l1.add(24);
//		l1.add("Apple");
//		l1.add(null);
//		l1.add(20.4f);
		
//		Homogeneous elemenst we used everytime
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(20);
		l2.add(50);
		l2.add(100);
		l2.add(null);
		l2.add(20);
		
		
		for(Integer i: l2) {
			System.out.print(i);
			System.out.print(" ");
		}
		
	}

}
