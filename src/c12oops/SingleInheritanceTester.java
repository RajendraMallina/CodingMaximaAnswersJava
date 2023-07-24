package c12oops;

public class SingleInheritanceTester {
	
    public static void main(String[] args) {
    	
        Calculator calculator = new Calculator();
        int sum = calculator.addtion(5, 3);
        int difference = calculator.subtraction(7, 2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        double squareRoot = scientificCalculator.squareRoot(25);
        double result = scientificCalculator.power(2, 3);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Power: " + result);
        
        //scientific calculator can executes calculator functionalities
        System.out.println("Sum: " + scientificCalculator.addtion(22, 60));
    }
}