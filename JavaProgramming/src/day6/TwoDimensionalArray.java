package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Declaration
		//Approach 1
		/*
		int a[][]= new int[3][2];
		  
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		*/
		
		//Approach 2
		
		int a[][] = {{100,200},{300,400},{500,600}};
		
		//find array length
//		System.out.println("Number of rows: "+a.length);
//		System.out.println("Number of columns: "+a[0].length);
//		
		//read a single value from array
//		System.out.println(a[1][0]);
//		System.out.println(a[2][0]);
		
		
		//read multiple values from array
		//using normal for loop
		/*
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[j].length-1; j++)
			{
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
		*/
		
		//using enhanced for loop / for each
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.print(x + "  ");
			}
			System.out.println();
		}

	}

}
