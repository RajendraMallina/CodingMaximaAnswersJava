package c14_exceptions;

public class UserDefinedException {

	public static void main(String[] args) {
		
		String name = "Rajendra Kumar";
		
		if(name.length() > 10) {
			
			try {
				
				throw new LongNameException("The name is more than 10 characters " + name);
				
			}catch(LongNameException e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Valid name");
		}

	}

}
