package c11_constructor_setter_getter_tostring_equal;

import java.util.Objects;

public class City {

	private String name;
	private String country;
	private long population;
	
	public City() {}

	public City(String name, String country, long population) {
		this.name = name;
		this.country = country;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(country, other.country);
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", population=" + population + "]";
	}	
}
