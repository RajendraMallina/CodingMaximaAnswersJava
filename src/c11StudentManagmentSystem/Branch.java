package c11StudentManagmentSystem;

public class Branch {
	
	private int brId;
	private String name;
	private int maxCount;
	
	public Branch() {}
	
	public Branch(int brId, String name, int maxCount) {
		this.brId = brId;
		this.name = name;
		this.maxCount = maxCount;
	}

	public int getBrId() {
		return brId;
	}

	public void setBrId(int brId) {
		this.brId = brId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + brId;
		result = prime * result + maxCount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Branch other = (Branch) obj;
		if (brId != other.brId)
			return false;
		if (maxCount != other.maxCount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Branch [brId=" + brId + ", name=" + name + ", maxCount=" + maxCount + "]";
	}
}
