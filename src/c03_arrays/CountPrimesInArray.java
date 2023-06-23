package c03_arrays;

public class CountPrimesInArray {
	
	public static void main(String[] args) {
		
		int array[] = {11, 85, 22, 23, 8, 60, 29};
		int primeCounter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(isPrime(array[i]))
				primeCounter++;
		}
		System.out.println("The number of prime numbers in array - " + primeCounter);
	}
	
	//method to find whether the number is prime or not
	public static boolean isPrime(int number){
		 if (number <= 1) {
			 return false;
		 }
        for (int i = 2; i <= number /2 ; i++) {
        	 if (number % i == 0) {
        		 return false;
        	 }     
        }
        return true;
	}
}
