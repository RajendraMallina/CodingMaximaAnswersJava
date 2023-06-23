package c03_arrays; 

public class SuperArray {

	public static void main(String[] args) {
		
		int array[] = { 22, 85, 11, 85, 11 };
		int superNumber = 22;

		boolean isSuper = false;
		for(int i = 0; i < array.length; i++) {
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i] + array[j] == superNumber) {			
					isSuper = true;
					break;
				}
			}
			if(isSuper) {
				break;
			}
		}
		
		if(isSuper) {
			System.out.println("Array is a Super Array");
		}else {
			System.out.println("Array is not a Super Array");
		}
	}
}
