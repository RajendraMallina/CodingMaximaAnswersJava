package c09_object_class;

public class CityMain {

	public static void main(String[] args) {
		
		City one = new City();
		one.name = "Vizag";
		one.country = "India";
		one.population = 400000;
		
		System.out.println(one);
		
		City two = new City();
		two.name = "Bali";
		two.country = "Indonesia";
		two.population = 22118560;
		
		System.out.println(two);
	}
}
