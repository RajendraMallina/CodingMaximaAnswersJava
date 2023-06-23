package c07_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {

	public static void main(String[] args) {

		String str = "coding maxima";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), count + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + 
						" occurs(multiple) " + entry.getValue() + "times");
			}
		}
	}
}
