package c09_object_class;

public class House {

	public int doorNumber;
	public int stairs;
	public String streetName;
	public int numberOfRooms;
	public double squareFeet;
	
	@Override
	public String toString() {
		return "House [doorNumber=" + doorNumber + ", stairs=" + stairs + ", streetName=" + streetName
				+ ", numberOfRooms=" + numberOfRooms + ", squareFeet=" + squareFeet + "]";
	}	
}
