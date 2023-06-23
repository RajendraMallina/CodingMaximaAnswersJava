package c03_arrays;

public class AllTypesOfArrays {

	public static void main(String[] args) {
		
		int intArr[] = {11, 85, 22, 60, 20};
		double doubleArr[] = {8511.85, 22.60, 10.20};
		char charArr[] = {'c', 'd', 'i', 'n', 'g'};
		boolean boolArr[] = {true, false, true, true, false};
		
		//here all arrays sizes are 5
		//so just repeating the loop for 5(indexes) times
		System.out.println("Integer Array :- ");
		for(int i = 0; i < intArr.length; i++) {
			System.out.print("intArr[" + i + "] = " + intArr[i] + ",  ");
		}
		
		System.out.println("\n\nDouble Array :- ");
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.print("doubleArr[" + i + "] = " + doubleArr[i] + ",  ");
		}
		
		System.out.println("\n\nChar Array :- ");
		for(int i = 0; i < charArr.length; i++) {
			System.out.print("charArr[" + i + "] = " + charArr[i] + ",  ");
		}
		
		System.out.println("\n\nBoolean Array :- ");
		for(int i = 0; i < boolArr.length; i++) {
			System.out.print("boolArr[" + i + "] = " + boolArr[i] + ",  ");
		}	
	}
}
