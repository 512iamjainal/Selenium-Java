package day7;

import java.util.Scanner;

public class TakingMultipleInputsFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Ex1
		/*
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter first number");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of numbers 1 and 2: "+ (num1+num2));
		*/
		
		//Ex2:
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Your name is: "+name+" and you are "+age+" years old");
		
		System.out.println("Enter unknown value: ");
		Object value = sc.next();
		System.out.println(value);
		

	}

}
