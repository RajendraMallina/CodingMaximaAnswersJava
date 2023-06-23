package c11_constructor_setter_getter_tostring_equal;

public class HumanTester {

	public static void main(String[] args) {
		 
		Human raje = new Human("Rajendra", 5.5, 66, "Male");
		Human chinna = new Human("Chinna", 5.4, 54, "Female");
		Human chintu = new Human("Chintu", 34.4, 666.5, "hello");
		
		System.out.println(raje);
		System.out.println(chinna);
		System.out.println(chintu);
	}
}
