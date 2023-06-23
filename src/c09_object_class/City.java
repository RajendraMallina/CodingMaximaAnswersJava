package c09_object_class;

public class City {

	public String name;
	public String country;
	public long population;
	
	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", population=" + population + "]";
	}	
}
