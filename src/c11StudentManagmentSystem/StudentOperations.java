package c11StudentManagmentSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentOperations {
	
	private Map<Integer, Student> students = new HashMap<>();

	public boolean addStudent(Student s) {
		
		if(students.containsKey(s.getStdId())) {
			
			return false;
		}else {
			
			students.put(s.getStdId(), s);
			return true;
		}
	}

	public Student getStudent(int stdId) {
		return students.get(stdId);
	}

	public List<Student> getAllStudents() {
		
		return (List<Student>) students.values();
	}
	
	public void replaceStudent(int stdId, Student std) {
		
		students.remove(stdId);
		students.put(std.getStdId(), std);
	}
	
	public boolean removeStudent(int stdId) {
		
		Student s = students.remove(stdId);
		if(s == null) {
			return false;
		}else {
			return true;
		}
	}

	public void makeNullBranch(Branch b) {
		// TODO Auto-generated method stub
		
	}
}
