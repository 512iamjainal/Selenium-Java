package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// Declare an array
		
		// Approach 1
		/*int a[] = new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
			
		//Approach 2
		
		int a[] = {100,200,300,400,500};
		
		
		//find length of an array
//		System.out.println(a.length);
		
		//read a single value from array
//		System.out.println(a[4]);
		
		//Reading multiple values from an array
		//using normal for loop
		/*
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		//enhanced for loop/ for each loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
