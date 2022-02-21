package c00_Intro;

public class ForLoopExample {

	public static void main(String[] args) {
		
		//print the values from 1 to 10
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i);
		}
		
		//print values from 20 to 0
		for(int i = 20; i >= 0; i--) {
			System.out.println(i);
		}
		
		//infinity loop
		for(int i = 0; i < 10; i--) {
			System.out.println(i);
		}
	}
}
