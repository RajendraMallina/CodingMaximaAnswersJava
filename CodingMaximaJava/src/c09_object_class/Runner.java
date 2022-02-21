package c09_object_class;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Room> house1Rooms = new ArrayList<>();
		ArrayList<Room> house2Rooms = new ArrayList<>();
		
		Room bedRoom = new Room(1, "BedRoom");
		Room bedRoom2 = new Room(2, "Bedroom2");
		Room kichin = new Room(3, "kichin");
		Room hall = new Room(4, "Hall");
		
		house1Rooms.add(bedRoom);
		house1Rooms.add(bedRoom2);
		house1Rooms.add(kichin);
		house1Rooms.add(hall);
		
		House house1 = new House(1, "My Villa", 255, house1Rooms);
		
		house2Rooms.add(bedRoom);
		house2Rooms.add(hall);
		house2Rooms.add(kichin);
		
		House house2 = new House(2, "My Second Villa", 190, house2Rooms);
		
		System.out.println(house1);
		System.out.println(house2);
		
	}

}
