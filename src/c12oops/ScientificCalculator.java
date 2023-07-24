package c12oops;

public class ScientificCalculator extends Calculator {
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
    
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}