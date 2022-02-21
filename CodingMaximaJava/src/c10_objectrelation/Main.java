package c10_objectrelation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Branch cse = new Branch(1, "CSE", 60);
		Branch ece = new Branch(2, "ECE", 60);
		Branch eee = new Branch(3, "EEE", 40);
		
		
		List<Branch> iareaBranches = new ArrayList<>();
		iareaBranches.add(eee);
		iareaBranches.add(ece);
		
		List<Branch> sasiBranches = new ArrayList<>();
		
		sasiBranches.add(eee);
		sasiBranches.add(ece);
		sasiBranches.add(cse);
		
		
		Collage sasi = new Collage(1, "Sasi InTe", sasiBranches);
		Collage iarea = new Collage(2, "Aeronatical ...", iareaBranches);
		
		System.out.println(sasi);
		System.out.println(iarea);
		
		Student s = new Student(1, "Rajendra", "Male", "A", cse);
		
		System.out.println(s);

	}

}
