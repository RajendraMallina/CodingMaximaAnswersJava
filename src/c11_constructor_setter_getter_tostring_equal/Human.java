package c11_constructor_setter_getter_tostring_equal;


public class Human {

	private String name;
	private double height;
	private double weight;
	private String gender;
	
	public Human() {}

	public Human(String name, double height, double weight, String gender) {
		this.name = name;
		setHeight(height);
		setWeight(weight);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height < 1.5) {
			this.height = 1.5;
		}else if(height > 10.5){
			this.height = 10.5;
		}else {
			this.height = height;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight < 5) {
			this.weight = 5;
		}else if(weight > 500) {
			this.weight = 500;
		}else {
			this.weight = weight;
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		
		if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
			this.gender = gender;
		}else {
			this.gender = "Others";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Human other = (Human) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", height=" + height + ", weight=" + weight + ", gender=" + gender + "]";
	}
}
