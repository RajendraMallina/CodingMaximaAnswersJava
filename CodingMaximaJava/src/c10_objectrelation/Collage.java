package c10_objectrelation;

import java.util.ArrayList;
import java.util.List;

public class Collage {
	
	private int id;
	private String name;
	private List<Branch> branches;
	
	public Collage() {}
	public Collage(int id, String name, List<Branch> branches) {
	
		this.id = id;
		this.name = name;
		this.branches = branches;
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
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "Collage [id=" + id + ", name=" + name + ", branches=" + branches + "]";
	}

	
	
}
