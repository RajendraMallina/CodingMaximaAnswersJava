package c14_exceptions;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		int a = Integer.parseInt("30");
		
		System.out.println(a);
		
		try {
			
			//int g = 10/0;
			int b = Integer.parseInt("1h");
			System.out.println(b);
			
		}catch(ArithmeticException e) {
			
			System.out.println("number format exception occur");
			
		}catch(NullPointerException e){
			
			System.out.println("Exception");
			
		}finally {
			
			System.out.println("Program executed");
		}
		

	}

}
