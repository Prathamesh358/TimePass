package javapractices;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapImpl {

	/*
	 * 1. Linked hashmap is the child class of the map interface. 2. it maintains
	 * the insertion order according to keys. 3. it doesnt allow multiple duplicate
	 * keys. 4. it allows multiple duplicate values. 5. it allows only single null
	 * key and allows multiple null values. 6. It is non-synchronous hence it is non
	 * thread safe.
	 */

	public static void main(String[] args) {

		LinkedHashMap<Long, String> lh = new LinkedHashMap<Long, String>();
		lh.put(345676899823L, "Akhil");
		lh.put(767635629835L, "Rakesh");
		lh.put(453268975626L, "Ankush");
		lh.put(345676899823L, "Akhil");
		lh.put(345678799823L, null);
		lh.put(null, null);
		lh.put(null, "John");
		

		System.out.println(lh);
		System.out.println();

		Set<Entry<Long, String>> e = lh.entrySet();
		Iterator<Entry<Long, String>> it = e.iterator();

		while (it.hasNext()) {

			Entry<Long, String> ee = it.next();
			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

	}

}
