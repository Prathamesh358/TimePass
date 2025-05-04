package javapractices;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapMethods {

	public static void main(String[] args) {

		LinkedHashMap<Long, String> hm1 = new LinkedHashMap<Long, String>();
		hm1.put(345676899823L, "Akhil");
		hm1.put(767635629835L, "Rakesh");
		hm1.put(453268975626L, "Ankush");
		hm1.put(345676899823L, "Akhil");
		hm1.put(345678799823L, null);
		hm1.put(null, null);

		LinkedHashMap<Long, String> hm2 = new LinkedHashMap<Long, String>();
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
		System.out.println("#####################################");

		Set<Entry<Long, String>> entries = hm1.entrySet();
		Iterator<Entry<Long, String>> iterator = entries.iterator();

		while (iterator.hasNext()) {

			Entry<Long, String> ee = iterator.next();

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println(hm1.entrySet().equals(hm2.entrySet()));

	}

}
