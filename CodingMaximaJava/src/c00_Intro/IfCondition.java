package c00_Intro;

public class IfCondition {

	public static void main(String[] args) {
		
		int value = 22;
		boolean flag = true;
		double d = 11.22;
		char letter = 'c';
		
		if(value > 11) {
			System.out.println("Given value is grater than 11 --> " + value);
		}
		
		//flag is a boolean variable(true/false) so no need to check with the condition
		if(flag) {
			System.out.println("The value is " + flag);
		}
		
		if(d != 11.85) {
			System.out.println("The value is not equal to " + d);
		}
		
		if(letter == 'c') {
			System.out.println("The letter is equal to character -> " + letter);
		}
	}
}
