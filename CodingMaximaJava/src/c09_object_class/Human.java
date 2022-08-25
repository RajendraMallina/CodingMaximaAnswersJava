package c09_object_class;

public class Human {

	public String name;
	public double height;
	public double weight;
	public String gender;
	public boolean isAlive;
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", height=" + height + ", weight=" + weight + ", gender=" + gender + ", isAlive="
				+ isAlive + "]";
	}
}
