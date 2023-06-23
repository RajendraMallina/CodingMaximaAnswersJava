package c08_multidimention;

public class TwoDimentionArray {

	public static void main(String[] args) {
		
		int arr[][] = {{11, 85, 22}, {60, 3, 5}, {69, 01, 16}};
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
