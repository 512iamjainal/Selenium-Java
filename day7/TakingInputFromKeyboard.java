package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        //int num=20;  // hard coded value
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		float num = sc.nextFloat();		
		System.out.println("Given number is "+num);
		*/
		
		System.out.println("Enter your cityname: ");
		String s = sc.next();
		System.out.println("Your city is: "+s);
		
	}

}
