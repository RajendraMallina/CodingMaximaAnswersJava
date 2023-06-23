package c09_object_class;

public class ObjectClassIntro {

	/*
	 * Object :- Instance of a class which handles the all properties and behaviours(methods) of class.
	 * 
	 * Class :- Class is a blue print which collection of objects properties and behaviours.
	 * 
	 */
	 public static void main(String[] args) {
		
		 Student s = new Student();
		 
		 s.id = 12;
		 s.name = "Rajendra";
		 s.gender = "male";
		 
		 Student s2 = new Student();
		 s2.id = 22;
		 s2.name = "shiva";
		 s2.gender = "Male";
		 
		 System.out.println(s.id + "  " + s.name + "  " + s.gender);
	}
	
}
