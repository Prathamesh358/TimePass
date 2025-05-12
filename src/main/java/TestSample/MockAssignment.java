package TestSample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MockAssignment {

	public static void main(String[] args) {

		String s = "Welcome to Codemind";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (!(map.containsKey(s.charAt(i)))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		Iterator<Entry<Character, Integer>> iterator = set.iterator();

		while (iterator.hasNext()) {

			Entry<Character, Integer> entry = iterator.next();

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
