package c00_Intro;

public class NestedIfExample {

	public static void main(String[] args) {
		
		int number = 22;
		
		if(number > 0) {
			
			System.out.println("The number is positive number -> " + number);
			
			if(number % 2 == 0) {
				
				System.out.println("The number is even number -> " + number);
			}else {
				System.out.println("The nubmer is odd number -> " + number);
			}
			
		}else {
			System.out.println("The number is negative number -> " + number);
		}
	}
}
