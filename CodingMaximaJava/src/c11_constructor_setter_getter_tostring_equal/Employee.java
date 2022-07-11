package c11_constructor_setter_getter_tostring_equal;

public class Employee {

	private int id;
	private String name;
	private String designation;
	private double salary;
	private double yearsOfExperiance;
	private boolean isPermanent;

	public Employee() {
		// by default permanent is true
		isPermanent = true;
	}

	public Employee(int id, String name, String designation, double salary, double yearsOfExperiance) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		setSalary(salary);
		setYearsOfExperiance(yearsOfExperiance);
		// by default permanent is true
		isPermanent = true;
	}

	public Employee(int id, String name, String designation, double salary, double yearsOfExperiance,
			boolean isPermanent) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		setSalary(salary);
		setYearsOfExperiance(yearsOfExperiance);
		this.isPermanent = isPermanent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {

		if (salary < 0.0) {
			this.salary = 0.0;
		} else if (salary > 1000000.00) {
			this.salary = 1000000.00;
		} else {
			this.salary = salary;
		}
	}

	public double getYearsOfExperiance() {
		return yearsOfExperiance;
	}

	public void setYearsOfExperiance(double yearsOfExperiance) {
		if (yearsOfExperiance < 0.0) {
			this.yearsOfExperiance = 0.0;
		} else if (yearsOfExperiance > 40.00) {
			this.yearsOfExperiance = 40.00;
		} else {
			this.yearsOfExperiance = yearsOfExperiance;
		}
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", yearsOfExperiance=" + yearsOfExperiance + ", isPermanent=" + isPermanent + "]";
	}
}
