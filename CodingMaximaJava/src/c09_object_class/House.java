package c09_object_class;

import java.util.ArrayList;

public class House {
	
	private int id;
	private String name;
	private double sqft;
	
	private ArrayList<Room> rooms;

	public House() {}
	
	public House(int id, String name, double sqft, ArrayList<Room> rooms) {
		
		this.id = id;
		this.name = name;
		this.sqft = sqft;
		this.rooms = rooms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSqft() {
		return sqft;
	}

	public void setSqft(double sqft) {
		this.sqft = sqft;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", name=" + name + ", sqft=" + sqft + ", rooms=" + rooms + "]";
	}

	
	
}
