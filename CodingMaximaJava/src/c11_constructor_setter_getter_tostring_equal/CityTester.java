package c11_constructor_setter_getter_tostring_equal;

public class CityTester {

	public static void main(String[] args) {
		
		City newYork = new City("New York", "United States", 8300000);
		City vizag = new City();
		vizag.setName("Vizag");
		vizag.setConuntry("India");
		vizag.setPapulation(200000000);
		
		System.out.println(newYork);
		System.out.println(vizag);
	}
}
