package day18;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		System.out.println("Program has started...");
		
		Scanner sc = new Scanner(System.in);
		
		//ex1
		/*System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(100/num);*/   //ArithmeticExpection
		
		//ex2
		/*int a[] = new int [5];
		System.out.println("Enter position (0-4)");
		int pos = sc.nextInt();
		
		System.out.println("Enter a value: ");
		int value = sc.nextInt();
		
		a[pos] = value;
		System.out.println(a[pos]);*/   //ArrayIndexOutOfBoundException
		
		//ex3
		/*String s = "welcome";
		int num = Integer.parseInt(s);
		System.out.println(num);  */  //NumberFormatException
		
		//ex4
		String s = null;
		System.out.println(s.length());  //NullPointerException
		
		
		
		
		System.out.println("Program has completed...");
		System.out.println("Program has exited...");

	}

}
