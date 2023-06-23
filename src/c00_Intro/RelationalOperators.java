package c00_Intro;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a = 11, b = 22, c = 60, d = 85, e = 22;
		
		boolean first = a > b; // 11 > 22 false
		boolean second = a < b; // 11 < 22 true
		boolean third = c == d; // 60 == 85 false
		boolean fourth = c != d; // 60 != 85 true
		boolean fifth = b == e; // 22 == 22 true
		
		System.out.println("11 > 22 -> 11 is not grater than 22 so -> " + first);
		System.out.println("11 < 22 -> 11 is less than 22 so -> " + second);
		System.out.println("60 == 85 -> 60 is not equals to 85 so -> " + third);
		System.out.println("60 != 85 -> 60 is not equals to 85 so -> " + fourth);
		System.out.println("22 == 22 -> 22 is equals to 22 so -> " + fifth);
	}
}
