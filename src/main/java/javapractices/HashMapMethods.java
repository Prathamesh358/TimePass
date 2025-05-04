package javapractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {

	/*
	 * 1. Hash map is the child class of the map interface
	 * 2. hashmap doesnt maintain insertion order according to keys.
	 * 3. hashmap doesnt allow duplicate key insertion 
	 * 4. hashmap allows duplicate value insertion. 
	 * 5. hashmap allows single null key and may allow multiple null values 
	 * 6. it is non-synchronous hence it is not thread safe.
	 */

	public static void main(String[] args) {

		HashMap<Long, String> hm1 = new HashMap<Long, String>();
		hm1.put(345676899823L, "Akhil");
		hm1.put(767635629835L, "Rakesh");
		hm1.put(453268975626L, "Ankush");
		hm1.put(345676899823L, "Akhil");
		hm1.put(345678799823L, null);
		hm1.put(null, null);

		HashMap<Long, String> hm2 = new HashMap<Long, String>();
		hm2.put(989676899823L, "Akhil");
		hm2.put(767635659835L, "Rakesh");
		hm2.put(990888975626L, "Ankush");

		System.out.println(hm1);

		System.out.println("########################");
		hm1.putAll(hm2);
		System.out.println(hm1);
		System.out.println("########################");

		System.out.println(hm1.keySet());
		System.out.println("########################");

		System.out.println(hm1.containsKey(767635659835L));

		System.out.println(hm1.containsValue("Rakesh"));

		System.out.println(hm1.isEmpty());

		Set<Entry<Long, String>> entries = hm1.entrySet();
		Iterator<Entry<Long, String>> iterator = entries.iterator();

		while (iterator.hasNext()) {

			Entry<Long, String> ee = iterator.next();

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

	}

}
