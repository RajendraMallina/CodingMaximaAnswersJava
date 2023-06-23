package c11_constructor_setter_getter_tostring_equal;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(8511);
		student.setName("Rajendra");
		student.setBranch("CSE");
		student.setTotalMarks(85.22);
		student.setGrade('A');
		
		Student student2 = new Student(2260, "Chinna", "ECE", 60, 'B');
		
		System.out.println(student);
		System.out.println(student2);
	}
}
