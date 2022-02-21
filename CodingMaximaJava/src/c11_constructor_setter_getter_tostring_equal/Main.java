package c11_constructor_setter_getter_tostring_equal;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee(1, "rajendra", 12000.00, "backend Developer");
		
		Employee e1 = new Employee(2, "rajendra", 12000.00, "backend Developer");
		
		System.out.println(e.equals(e1));
		
		System.out.println(e);
		System.out.println(e1);
	}
}
