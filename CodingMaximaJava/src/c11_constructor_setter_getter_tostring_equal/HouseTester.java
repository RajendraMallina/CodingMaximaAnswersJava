package c11_constructor_setter_getter_tostring_equal;

public class HouseTester {

	public static void main(String[] args) {
		
		House h1 = new House();
		h1.setDoorNumber("9-43");
		h1.setNumberOfStairs(2);
		h1.setStreetName("First Street");
		h1.setNubmerOfRooms(11);
		h1.setSqareFeet(300);
		
		House h2 = new House("111-85C", 3, "Hitech Hills", 22, 500);
		
		System.out.println(h1);
		System.out.println(h2);
	}
}
