package c12oops;

public class Person {

	protected String name;
	protected String mobileNumber;
	protected String gender;
	protected int age;

	public Person(String name, String mobileNumber, String gender, int age) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.age = age;
	}

	public void disPlayDetails() {
		System.out.println("Person [name=" + name 
				+ ", mobileNumber=" + mobileNumber 
				+ ", gender=" + gender + ", age="+ age + "]");
	}

}
