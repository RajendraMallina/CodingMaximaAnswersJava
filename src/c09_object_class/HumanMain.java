package c09_object_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.name = "Rajendra";
		h1.height = 5.5;
		h1.weight = 58.66;
		h1.gender = "Male";
		h1.isAlive = true;
		
		Human h2 = new Human();
		h2.name = "Chintu";
		h2.height = 5.3;
		h2.weight = 56;
		h2.gender = "Female";
		h2.isAlive = true;
		
		Human h3 = new Human();
		h3.name = "Ramu";
		h3.height = 5.2;
		h3.weight = 70;
		h3.gender = "Male";
		h3.isAlive = false;
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
	}
}
