package c12oops;

import java.math.BigDecimal;

public class HierarchicalInheritanceTester {

	public static void main(String[] args) {
		
        double principal = 10000.0;
        int years = 5;
        double rate = 5.0;

        SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator(principal, years, rate);
        double simpleInterest = simpleInterestCalculator.calculateInterest();
        simpleInterestCalculator.display();
        System.out.println("Simple Interest: " + simpleInterest);

        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator(principal, years, rate);
        double compoundInterest = compoundInterestCalculator.calculateInterest();
        compoundInterestCalculator.display();
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
