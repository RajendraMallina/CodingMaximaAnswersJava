package c10_objectrelation;

public class Branch {
	
	private int id;
	private String name;
	private int maxCapacity;
	
	public Branch() {}
	
	public Branch(int id, String name, int maxCapacity) {
	
		this.id = id;
		this.name = name;
		this.maxCapacity = maxCapacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return name;
	}

	public void setBname(String name) {
		this.name = name;
	}

	public int getMaxSeats() {
		return maxCapacity;
	}

	public void setMaxSeats(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", maxCapacity=" + maxCapacity + "]";
	}	
}
