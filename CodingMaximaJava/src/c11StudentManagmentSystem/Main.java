package c11StudentManagmentSystem;

public class Main {

	public static void main(String[] args) {
		
		BranchOperations branchOperations = new BranchOperations();
		StudentOperations studentOperations = new StudentOperations();
		
		Branch cse = new Branch(1, "cse", 60);
		Branch ece = new Branch(2, "ece", 60);
		Branch eee = new Branch(3, "eee", 60);
		Branch civil = new Branch(4, "civil", 60);
		
		System.out.println("adding cse - " + branchOperations.addBranch(cse));
		System.out.println("adding ece - " + branchOperations.addBranch(ece));
		System.out.println("adding eee - " + branchOperations.addBranch(eee));
		System.out.println("adding civil - " + branchOperations.addBranch(civil));
		System.out.println("adding civil - " + branchOperations.addBranch(civil));
		System.out.println("adding cse - " + branchOperations.addBranch(cse));
		System.out.println(branchOperations.getAllBranches());
		System.out.println(branchOperations.getBranch(1));
		
		Branch mech = new Branch(5, "mech", 20);
		
		
		Student s = new Student(1, "Rajendra", 'A', "Male", 66.6, branchOperations.getBranch(1));
		Student s1 = new Student(2, "Bobby", 'D', "Male", 66.6, branchOperations.getBranch(4));
		Student s2 = new Student(3, "Divya", 'B', "FeMale", 66.6, branchOperations.getBranch(1));
		Student s3 = new Student(4, "Seerisha", 'D', "FeMale", 66.6, branchOperations.getBranch(2));	
		
		System.out.println("adding rajendra - " + studentOperations.addStudent(s));
		System.out.println("adding bobby - " + studentOperations.addStudent(s1));
		System.out.println("adding divya - " + studentOperations.addStudent(s2));
		System.out.println("adding seerisha - " + studentOperations.addStudent(s3));
		System.out.println("adding seerisha - " + studentOperations.addStudent(s3));
		
		System.out.println(studentOperations.getAllStudents());
		
		branchOperations.replace(ece, mech, studentOperations);
		System.out.println(branchOperations.getAllBranches());
		
		System.out.println(studentOperations.getStudent(1));
		System.out.println(studentOperations.getStudent(4));
			
	}
}
