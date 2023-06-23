package c00_Intro;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		int number = 100;
		
		while(number > 0) {
			
			System.out.println(number);
			number = number / 10;
		}
	}
}
