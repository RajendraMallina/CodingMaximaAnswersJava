package c07_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class UniqueNumber {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int arr[] = {11, 20, 22, 22, 60, 60, 85, 3};
		
		for(int num : arr) {
			
			if(map.containsKey(num)) {
				int count = map.get(num);
				map.put(num, count + 1);
			}else {
				map.put(num, 1);
			}
		}
		
		System.out.println("The unique numbers in the array are ");
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey() + "  ");
			}
		}
	}
}
