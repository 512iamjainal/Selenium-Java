package day7;

public class AssignmentArray2 {

	public static void main(String[] args) {
		
		
		//1) Sorting array elements in array using for loop
		
		//2) Find missing in number in array
		// a = {1,5,4,3}     numbers should be in range
		// should not have duplicates
		/*
		 int a[] = {1,5,4,3};
		 
		 int sum1=0;
		 for(int i=0; i<=a.length-1;i++)
		 {
			 sum1=sum1+a[i];
		 }
		 System.out.println("Sum of elements: " + sum1);
		 
		 int sum2 = 0;
		 
		 for(int i=1; i<=5; i++ )
		 {
			 sum2 = sum2+i;
		 }
		 
		 System.out.println("sum of range of elements in array: "+sum2);
		 System.out.println("missing num is: "+(sum2-sum1));
		 */
		
		//3) find largest numbers in array
			int a[]= {10,20,30,100,40};
			
			int max=a[0];
			
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]>max) {
					max = a[i];
				}
			}
			System.out.println(max);
			
		//4) find lowest number in array
			int b[]= {10,20,30,100,40};
			
			int min=a[0];
			
			for(int i=0;i<=a.length-1;i++) {
				if(b[i]<min) {
					min = b[i];
				}
			}
			System.out.println(min);
		

	}

}
