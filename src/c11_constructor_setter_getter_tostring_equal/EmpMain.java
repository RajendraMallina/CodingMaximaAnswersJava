package c11_constructor_setter_getter_tostring_equal;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee rajendra = new Employee(2260, "Rajendra", "Software Engineer", 100000, 14.5);
		Employee chintu = new Employee(8511, "Chintu", "Manager", -1185.22, 60);
		Employee ramu = new Employee(143, "Ramu", "Analyst", 50000, 3, false);
		Employee vamsi = new Employee(234, "Vamsi", "FullStack Engineer", 6000000, -10);
		
		System.out.println(rajendra);
		System.out.println(chintu);
		System.out.println(ramu);
		System.out.println(vamsi);		
	}
}
