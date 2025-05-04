package javapractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImpl {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(2345, "Amit");
		m1.put(4567, "akash");
		m1.put(9898, "john");
		m1.put(5675, "mithilesh");
		m1.put(null, null);
		m1.put(4567, "Rajesh");

		Set<Entry<Integer, String>> se = m1.entrySet();

		Iterator<Entry<Integer, String>> itr1 = se.iterator();

		while (itr1.hasNext()) {

			Entry<Integer, String> se2 = itr1.next();

			System.out.println(se2.getKey() + " : " + se2.getValue());
		}

//		for(Entry<Integer, String> rt : m1.entrySet()) {
//			System.out.println(rt.getKey() + " : "+ rt.getValue());
//		}

		System.out.println(m1.values());
		System.out.println(m1.keySet());

	}

}
