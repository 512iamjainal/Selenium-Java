package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
//		String s[]= {"A","C","D","B"};
		char c[]= {'A','D','B','C'};
		
		System.out.println("Before sorting..." + Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println("After sorting..." + Arrays.toString(c));
		
		

	}

}
