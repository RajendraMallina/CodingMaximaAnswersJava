package c10_objectrelation;

public class StudentBranchMain {

	public static void main(String[] args) {
		
		Branch cse = new Branch(1, "Computer Science Engineering", 60);
		Branch it = new Branch(2, "Information Technology", 85);
		Branch bsc = new Branch(3, "Bachelor of Science", 22);
		
		Student one = new Student(101, "Chinna", cse);
		Student two = new Student(102, "Rajendra", cse);
		Student three = new Student(103, "Ramu", it);
		
		System.out.println("The Available Branches:- ");
		System.out.println(cse + "\n" + it + "\n" + bsc);
		System.out.println("\nThe Available Students:- ");
		System.out.println(one + "\n" + two + "\n" + three);
	}
}
