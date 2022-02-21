package c10_objectrelation;

public class Student {

	private int id;
	private String name;
	private String gender;
	private String grade;
	private Branch branch;
	
	public Student() {}
	
	public Student(int id, String name, String gender, String grade, Branch branch) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
		this.branch = branch;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", grade=" + grade + ", branch=" + branch
				+ "]";
	}

	
}
