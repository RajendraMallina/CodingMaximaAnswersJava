package c12oops;

public class Employee extends Person{

	protected String empId;
	protected String company;
	protected String department;
	protected double salary;
	
	public Employee(String name, String mobileNumber, String gender, int age, String empId, String company,
			String department, double salary) {
		super(name, mobileNumber, gender, age);
		this.empId = empId;
		this.company = company;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public void disPlayDetails() {
		super.disPlayDetails();
		System.out.println("Employee [empId=" + empId + ", company=" + company 
				+ ", department=" + department + ", salary=" + salary + "]");
	}
}
