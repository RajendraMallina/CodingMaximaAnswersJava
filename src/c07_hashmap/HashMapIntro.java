package c07_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIntro {
	
	public static void main(String[] args) {
		
		
		Map<Integer, Integer> list = new HashMap<>();
		
		//insert data into hashmap
		list.put(11, 22);
		list.put(22, 60);
		list.put(10, 20);
		list.put(85, 22);
		
		//geting value from hash map
		System.out.println(list.get(22));
		
		//1st way print hash map
		Set<Integer> set = list.keySet();
		
		System.out.println("Printing 1st way :- ");
		for(Integer i : set) {
			
			System.out.println( i + " -> " + list.get(i));
			
		}
		
		//2nd way print hash map
		System.out.println("Printing second way : - ");
		for(Entry<Integer, Integer> s : list.entrySet()) {
			
			System.out.println(s.getKey() + " -> " + s.getValue());
		}

		
	}

}
