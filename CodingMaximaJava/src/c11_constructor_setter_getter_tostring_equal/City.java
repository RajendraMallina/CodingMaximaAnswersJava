package c11_constructor_setter_getter_tostring_equal;

import java.util.Objects;

public class City {

	private String name;
	private String conuntry;
	private long papulation;
	
	public City() {}

	public City(String name, String conuntry, long papulation) {
		this.name = name;
		this.conuntry = conuntry;
		this.papulation = papulation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConuntry() {
		return conuntry;
	}

	public void setConuntry(String conuntry) {
		this.conuntry = conuntry;
	}

	public long getPapulation() {
		return papulation;
	}

	public void setPapulation(long papulation) {
		this.papulation = papulation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conuntry);
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
		return Objects.equals(conuntry, other.conuntry);
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", conuntry=" + conuntry + ", papulation=" + papulation + "]";
	}	
}
