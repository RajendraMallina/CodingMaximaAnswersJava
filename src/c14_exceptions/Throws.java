package c14_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws IOException, ArithmeticException {
		
		FileReader fr = new FileReader("C:\\Users\\pankaj\\Desktop\\test.txt");
	 
	        // Declaring loop variable
	        int i;
	        // Holds true till there is nothing to read
	        while ((i = fr.read()) != -1)
	 
	            // Print all the content of a file
	            System.out.print((char)i);
	}

}
