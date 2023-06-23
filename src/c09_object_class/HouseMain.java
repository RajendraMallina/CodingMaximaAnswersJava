package c09_object_class;

public class HouseMain {

	public static void main(String[] args) {
		
		House first = new House();
		first.doorNumber = 1185;
		first.stairs = 2;
		first.streetName = "first street";
		first.numberOfRooms = 11;
		first.squareFeet = 200.5;
		
		System.out.println(first);
		
		House second = new House();
		second.doorNumber = 2260;
		second.stairs = 5;
		second.streetName = "second street";
		second.numberOfRooms = 22;
		second.squareFeet = 6022.5;
		
		System.out.println(second);
	}
}
