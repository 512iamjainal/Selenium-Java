package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		/*
		int a[]= {20,10,40,50,30};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);  //mutable
		System.out.println(Arrays.toString(a));
		*/
		
		String s = new String("welcome");
		
		System.out.println(s);
		
		String newstring = s.concat("to java");
		
		System.out.println(newstring  );
		
		
	}

}
