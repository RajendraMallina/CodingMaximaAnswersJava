package c11StudentManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class BranchOperations {
	
	private List<Branch> branches = new ArrayList<>();

	public boolean addBranch(Branch b) {
		
		for(Branch br : branches) {
			if(br.equals(b)) {
				return false;
			}
		}
		
		branches.add(b);
		return true;
		
	}
	
	public Branch getBranch(int id) {
		
		for(Branch br : branches) {
			
			if(br.getBrId() == id) {
				return br;
			}
		}
		
		return null;
	}
	
	public boolean deleteBranch(Branch b) {
		
		boolean find = false;
		for(Branch br : branches) {
			if(br.equals(b)) {
				find = true;
				break;
			}
		}
		
		if(find) {
			branches.remove(b);
		}
		
		return find;
	}
	
	public void replace(Branch b, Branch b1, StudentOperations studentOperations) {
		
		if(deleteBranch(b)) {
			
			studentOperations.makeNullBranch(b);
			addBranch(b1);
		}
	}
	
	public List<Branch> getAllBranches(){
		return branches;
	}

}
