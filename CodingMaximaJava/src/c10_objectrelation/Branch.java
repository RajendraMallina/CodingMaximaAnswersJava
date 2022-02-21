package c10_objectrelation;

public class Branch {
	
	private int id;
	private String bname;
	private int maxSeats;
	
	public Branch() {}
	
	public Branch(int id, String bname, int maxSeats) {
	
		this.id = id;
		this.bname = bname;
		this.maxSeats = maxSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", bname=" + bname + ", maxSeats=" + maxSeats + "]";
	}	

}
