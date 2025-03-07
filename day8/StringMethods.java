package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		//String s="Welcome";
//		String s = new String("Welcome");
		
		//System.out.println(s);
		
		//length() = returns the length of a string(number of characters)
		/*
		String s = "Welcome";
		int l=s.length();
		
		System.out.println(l);
		
		System.out.println(s.length());
		
		System.out.println("Welcome".length());
		*/
		
		//concat() - joining strings
		/*
		String s1 = "Welcome";
		String s2 = " to java";
		String s3 = "Automation";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		*/
		
		
		//trim()
		/*
		String s = "   welcome    ";
		System.out.println(s.trim().length());
		System.out.println(s.length());
		System.out.println(s.trim().concat("to java"));
		*/
		
		//charAt()
		String s = "Welcome";
		System.out.println(s.charAt(5));
		
		
		//contains()
		System.out.println(s.contains("el")); 
		System.out.println(s.contains("com"));
		System.out.println(s.contains("wel")); // false bcz case sensitive
		
		//equals() , equalsIgnoreCase()   -> compare strings
		
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome" ));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
				
		//replace()
		
		s = "welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'i'));
		
		System.out.println(s.replace("selenium", "playright"));
		
		//substring
		s="Selenium";
		System.out.println(s.substring(1, 5));
		System.out.println(s.substring(0, 3));
		
		
		// toUpperCase() , toLowerCase()
		
		s="Selenium";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		//split()
		s="abc@gmail.com";
		String a[] = s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		//ex1
		String amount = "$15,20,55";
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace(",", "").replace("$", ""));
		//ex2
		s="abc,123@xyz";
		String arr1[]=s.split(",");
		System.out.println(Arrays.toString(arr1));
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		//ex3
		s="abc 123 xyz";
		String ar[]=s.split(" ");
		System.out.println(Arrays.toString(ar));
		
		
		
	}

}
