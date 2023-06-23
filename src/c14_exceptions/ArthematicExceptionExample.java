package c14_exceptions;

public class ArthematicExceptionExample {

	public static void main(String[] args) {
		
		int a = 1;
		try {
			
			a = 10 / 1;
			
		}catch(ArithmeticException e) {
			
			System.out.println("found arthematic exeption");
		}		
		System.out.println(a);
	}
}
