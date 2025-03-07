package day9;

public class ReverseString {

	public static void main(String[] args) {
		// Approach 1
		/*
		String s="welcome";
		String revString = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			revString = revString + s.charAt(i);
		}
		System.out.println(revString);
		*/
		
		//Approach 2
		/*
		String s="welcome";
		String rev="";
		
		char a[]= s.toCharArray();
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev = rev + a[i];
		}
		System.out.println(rev);
		*/
		
		// Approach 3
		/*
		StringBuffer s = new StringBuffer("welcome");
		System.out.println(s.reverse());
		
		StringBuilder s = new StringBuilder("welcome");
		System.out.println(s.reverse());
		*/
		
		
		
		
		
		
	}	

}
