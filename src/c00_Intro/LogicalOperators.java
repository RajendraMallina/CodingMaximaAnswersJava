package c00_Intro;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		/*
		 *   true && true = true
		 *   true && false = false
		 *   false && true = false
		 *   false && false = false
		 *   
		 *   true || true = true
		 *   true || false = true
		 *   false || true = true
		 *   false || false = false  
		 */
		
		int a = 10;
		System.out.println("10 is grater than 0(true) and lessthan or equal to 10 (true) so -> " +  (a > 0 && a <= 10));
		System.out.println("10 is not grater than 20(false) or lessthan 15(true) so -> " +  (a > 20 || a < 15));
		System.out.println("10 is not grater than 20(false) and lessthan 15 so(true) so -> " +  (a > 20 && a < 15));
		System.out.println("10 is not grater than 20(false) or graterthan 10 so(false) so -> " +  (a > 20 || a > 10));
	}
}
