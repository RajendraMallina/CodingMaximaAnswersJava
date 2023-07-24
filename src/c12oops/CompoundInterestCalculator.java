package c12oops;

public class CompoundInterestCalculator extends InterestCalculator {
	
    public CompoundInterestCalculator(double principal, int years, double rate) {
        super(principal, years, rate);
    }

    public double calculateInterest() {
        return principal * Math.pow(1 + rate / 100, years) - principal;
    }
}