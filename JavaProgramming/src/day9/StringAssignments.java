package day9;

public class StringAssignments {

	public static void main(String[] args) {
		
		//1)check if given string is palindrome or not,   String s = "madam"
		/*
		String s = "madam";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		*/
		
		
		//2) remove junk or special characters from string
		/*
		String s = "abc@ijk,lmn";
		
		System.out.println(s.replace("@","").replace(",", ""));
		*/
		
		//3)how to remove white spaces in a string
		/*
		String s = "            hi    ";
		System.out.println(s.trim());
		*/
		
		//4) count occurrences of a character in a string
		/*
		String s = "abcacbbcbascbabcccaaaaaa";
		
		int total = s.length();
		int totalAfterReplaced = s.replace("a", "").length();
		
		int count = total - totalAfterReplaced; 
		System.out.println(count);
		*/
		
	
		//5) count words in a string
		String s = "Hello How are you doing";
		int count = 1;
		for(int i=0; i<s.length()-1; i++) 
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
