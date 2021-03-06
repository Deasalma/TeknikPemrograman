package addnum;
import java.io.*;
/**
 * <h1>Add Two Numbers!</h1>
 * The Addnum program implements an application that 
 * simply adds two given integer numbers and Prints
 * the on the screen 
 * <p>
 * <b>Note:</b> Giving proper coments in your program makes it more 
 * user friendly and it is assumed as a high quality code.
 * 
 * @author Dea Salma Isnaini
 * @version 1.0
 * @since 2022-02-09
 */

public class AddNum {
	
/** 
 * This method id used to add two integers. This is 
 * a the simplest form of a class method, just to 
 * show the usage of various javadoc Tags.
 * @param numA This is the first parameter to addnum merthod 
 * @param numB is a This is the second parameters to addnum method 
 * @return int This returns sum of numA and numB.
 */
	public int addNum(int numA, int numB) {
		return numA+numB;
	}
	
	/** 
	 * This is a the main method which makes use of addnum method.
	 * @param args Unused.
	 * @see IOException On input error.
	 * @see IOException 
	 */
	
	public static void main(String args[]) throws IOException {
		AddNum obj = new AddNum();
		int sum = obj.addNum(10, 20);
		
		System.out.println("Sum of 10 ND 20 is :"+sum);
	}
}
