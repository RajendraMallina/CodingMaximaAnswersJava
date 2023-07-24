package c12oops;

public class SimpleInterestCalculator extends InterestCalculator {
	
    public SimpleInterestCalculator(double principal, int years, double rate) {
        super(principal, years, rate);
    }
    
    public double calculateInterest() {
        return principal * rate * years;
    }
}
