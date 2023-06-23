package c11_constructor_setter_getter_tostring_equal;

public class Student {

	private int id;
	private String name;
	private String branch;
	private double totalMarks;
	private char grade;
	
	public Student() {}

	public Student(int id, String name, String branch, double totalMarks, char grade) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.totalMarks = totalMarks;
		this.grade = grade;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ","
				+ " totalMarks=" + totalMarks + ", grade=" + grade + "]";
	}
}
