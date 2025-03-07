package day18;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {


System.out.println("Program has started...");
		
		Scanner sc = new Scanner(System.in);
		
		//ex1
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		try
		{
		System.out.println(100/num);   //ArithmeticExpection 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data");
		}
		System.out.println("Program has completed...");
		System.out.println("Program has exited...");

	}

}
