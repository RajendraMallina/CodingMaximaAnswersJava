package c00_Intro;

public class ElseIfLader {

	public static void main(String[] args) {
		
		int value = 22;
		
		if(value < 10) {
			System.out.println("The value is less than 10 -> " + value);
			
		}else if(value < 20) {
			System.out.println("The value is less than 20 -> " + value);
			
		}else if(value < 30) {
			System.out.println("The value is less than 30 -> " + value);
			
		}else if(value < 40) {
			System.out.println("The value is less than 40 -> " + value);
			
		}else {
			System.out.println("The vlaue is grater than or equal to 40 -> " + value);
		}
	}
}
