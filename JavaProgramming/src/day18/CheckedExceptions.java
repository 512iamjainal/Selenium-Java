package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
			
		System.out.println("Program started");
		System.out.println("Program in progress");
		
		Thread.sleep(5000);
		FileInputStream file = new FileInputStream("C:\\TEXT.txt");
		/*try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}*/
		
		System.out.println("Program finished");
		System.out.println("Program exited");

	}

}
