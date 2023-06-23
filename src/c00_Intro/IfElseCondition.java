package c00_Intro;

public class IfElseCondition {

	public static void main(String[] args) {
		
		int val = 22;
		
		//22 is not grater than 85 which means false so else block will execute
		if(val > 85) {
			System.out.println("The value " + val + " is grater than 85");
		}else {
			System.out.println("The value " + val + " is less than 85");
		}

	}

}
