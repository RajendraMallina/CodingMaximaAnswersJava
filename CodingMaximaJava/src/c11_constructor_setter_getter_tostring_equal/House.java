package c11_constructor_setter_getter_tostring_equal;

public class House {

	private String doorNumber;
	private int numberOfStairs;
	private String streetName;
	private int nubmerOfRooms;
	private double sqareFeet;
	
	public House() {}

	public House(String doorNumber, int numberOfStairs, String streetName, int nubmerOfRooms, double sqareFeet) {
		this.doorNumber = doorNumber;
		this.numberOfStairs = numberOfStairs;
		this.streetName = streetName;
		this.nubmerOfRooms = nubmerOfRooms;
		this.sqareFeet = sqareFeet;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public int getNumberOfStairs() {
		return numberOfStairs;
	}

	public void setNumberOfStairs(int numberOfStairs) {
		this.numberOfStairs = numberOfStairs;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getNubmerOfRooms() {
		return nubmerOfRooms;
	}

	public void setNubmerOfRooms(int nubmerOfRooms) {
		this.nubmerOfRooms = nubmerOfRooms;
	}

	public double getSqareFeet() {
		return sqareFeet;
	}

	public void setSqareFeet(double sqareFeet) {
		this.sqareFeet = sqareFeet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doorNumber == null) ? 0 : doorNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (doorNumber == null) {
			if (other.doorNumber != null)
				return false;
		} else if (!doorNumber.equals(other.doorNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "House [doorNumber=" + doorNumber + ", numberOfStairs=" + numberOfStairs + ", streetName=" + streetName
				+ ", nubmerOfRooms=" + nubmerOfRooms + ", sqareFeet=" + sqareFeet + "]";
	}
}
