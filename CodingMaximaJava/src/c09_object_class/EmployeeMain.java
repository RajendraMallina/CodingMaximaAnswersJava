package c09_object_class;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.id = 1185;
		emp1.name = "Kumar Rajendra";
		emp1.yearsOfExperience = 5;
		emp1.salary = 500000;

		System.out.println("Employee Details = " + emp1.id + ", " + emp1.name
				+ ", " + emp1.yearsOfExperience + ", " + emp1.salary);
		
		Employee emp2 = new Employee();
		emp2.id = 2260;
		emp2.name = "Chinna";
		emp2.yearsOfExperience = 3;
		emp2.salary = 600000;
		
		System.out.println("Employee Id = " + emp2.id + ", Employee name = " + emp2.name
				+ ", Employee Experience = " + emp2.yearsOfExperience 
				+ ", Employee Salary = " + emp2.salary);
	}
}
