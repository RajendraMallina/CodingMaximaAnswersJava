package c12oops;

public class InterestCalculator {
	
    protected double principal;
    protected int years;
    protected double rate;

    public InterestCalculator(double principal, int years, double rate) {
        this.principal = principal;
        this.years = years;
        this.rate = rate;
    }
    
    public void display() {
        
        System.out.println("Principal: " + principal);
        System.out.println("Years: " + years);
        System.out.println("Rate: " + rate + "%");
       
    }
}

