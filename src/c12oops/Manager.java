package c12oops;

public class Manager extends Employee{

	protected int leadTeamSize;

	public Manager(String name, String mobileNumber, String gender, int age, String empId, String company,
			String department, double salary, int leadTeamSize) {
		super(name, mobileNumber, gender, age, empId, company, department, salary);
		this.leadTeamSize = leadTeamSize;
	}

	@Override
	public void disPlayDetails() {
		super.disPlayDetails();
		System.out.println("Manager [leadTeamSize=" + leadTeamSize + "]");
	}

}
