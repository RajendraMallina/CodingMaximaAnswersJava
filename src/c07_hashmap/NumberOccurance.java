package c07_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOccurance {

	public static void main(String[] args) {

		int arr[] = { 11, 22, 85, 85, 85, 22, 60, 60, 10, 20, 20, 20 };

		// key = number, value = occurance count of number
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {

			if (map.containsKey(num)) {

				int value = map.get(num);
				map.put(num, value + 1);

			} else {

				map.put(num, 1);
			}
		}

		int max = Integer.MIN_VALUE;
		// 2nd way print hash map
		System.out.println("Printing second way : - ");
		for (Entry<Integer, Integer> s : map.entrySet()) {

			if(max < s.getValue()) {
				max = s.getValue();
			}	
		}
		
		for (Entry<Integer, Integer> s : map.entrySet()) {

			if(s.getValue() == max) {
				System.out.println(s.getKey() + " -> " + s.getValue());
			}
			
		}

	}

}
