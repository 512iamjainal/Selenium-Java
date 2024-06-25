package day4;

public class Assignment {

	public static void main(String[] args) {
		// 1. Largest of 2 numbers
		
		/*int a = 10, b=20;
		
		if(a>b) {
			System.out.println("a is largest");
		}
		else {
			System.out.println("b is largest");
		}*/
		
		
		// 2. Smallest of 3 numbers
		/*int a = 10,b=20,c=30;
		if (a<b && a<c) {
			System.out.println("a is smallest");
		}
		else if(b<a && b<c){
			System.out.println("b is smallest");
		}
		else {
			System.out.println("c is smallest");
		}*/
		
		
		// 3. Print week number based on weeknames
		
		String weekname = "Friday";
		
		switch (weekname) 
		{
		case "Monday": System.out.println("Week num is 1"); break;
		case "Tuesday": System.out.println("Week num is 2"); break;
		case "Wednesday": System.out.println("Week num is 3"); break;
		case "Thursday": System.out.println("Week num is 4"); break;
		case "Friday": System.out.println("Week num is 5"); break;
		case "Saturday": System.out.println("Week num is 6"); break;
		case "Sunday": System.out.println("Week num is 7"); break;
		default: System.out.println("Invalid week name");
		}

	}

}
