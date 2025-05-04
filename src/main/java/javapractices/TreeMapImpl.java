package javapractices;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	/*
	 * 1. TreeMap is the child class of SortedMap interface and child of map
	 * interface. 2. It doesn't allow duplicate keys 3. it allows duplicate values.
	 * 4. It doesn't allow null key and may allow multiple null values. 5. It
	 * maintains the insertion order in ascending order according to keys. 6. It is
	 * synchronous hence it is thread safe.
	 */

	public static void main(String[] args) {

		TreeMap<Long, String> ee1 = new TreeMap<Long, String>();
		ee1.put(56656L, "arif");
		ee1.put(65654L, "rakesh");
		ee1.put(88787L, "sunil");
		ee1.put(99655L, "akash");
		ee1.put(31353L, "sagar");
		ee1.put(78659L, null);

		System.out.println(ee1);

		Set<Entry<Long, String>> rt = ee1.entrySet();

		Iterator<Entry<Long, String>> ss = rt.iterator();

		while (ss.hasNext()) {
			System.out.println();
		}
		
		

//		for (Map.Entry<Long, String> entry : ee1.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

	}
}
