package day6;

public class ArrayAssignment {
	
	public static void main(String[] args)
	{
		//find sum of elements in array
		/*
		int a[] = {1,2,3,4,5};
		
		int sum = 0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		*/
		
		//print even and odd numbers from array
		/*
		int a[] = {1,2,3,4,5,6};
		
		System.out.println("Printing even numbers from array");
		for(int i=0; i<=a.length-1; i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Printing oddd numbers from array");
		for(int i=0; i<=a.length-1; i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}
		*/
		
		//check if number is prime or not
		
		int num = 3;
		int count = 0;
		
		if(num>1) 
		{
			for(int i=1; i<=num; i++) 
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
