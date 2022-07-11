package c02_methods;

public class EvenOddWithMethod {

	public static void main(String[] args) {
		
		evenOdd(11);
		evenOdd(22);
		evenOdd(85);

	}

	public static void evenOdd(int number) {
		
		if(number % 2 == 0) {
			System.out.println(number + " is a even number.");
		}else {
			System.out.println(number + " is a odd number.");
		}	
	}
}
