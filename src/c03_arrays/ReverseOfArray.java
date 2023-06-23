package c03_arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		int array[] = {11, 22, 4, 85, 7};
		int temp[] = new int[array.length];
		
		for (int i = array.length - 1, j = 0; i >= 0 ; i--, j++) {
			temp[j] = array[i];
		}
		
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "   ");
		}
	}
}
