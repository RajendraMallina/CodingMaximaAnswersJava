package c14_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		String s = "hello";
		String s1 = null;
		
		if(s.contains("h")) {
			System.out.println("YES");
		}
		
		try {
			
			if(s1.contains("l")) {
				System.out.println("YES2");
			}
			
		}catch(NullPointerException e) {
			
			System.out.println("null pointer exception occur");
		}
		

	}

}
