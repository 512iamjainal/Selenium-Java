package day5;

public class WhileLoop {

	public static void main(String[] args) {
		// Ex1 = print 1,.....,10
		
		/*int i = 1;   //Initialization
		
		while(i<=10)  // condition
		{
			System.out.println(i);
			i++;  //inc
		}*/
		
		//Ex2 Print "Hello" 10x
		/*int i = 1;
		while(i<=10)
		{
			System.out.println("hello");
			i++;
		}*/
		
		//Ex3 print even numbers
		//approach1
		/*int i = 2;
		while(i<=10)
		{
			System.out.println(i);
			i=i+2;
		}*/
		
		
		//approach2
		/*int i = 1;
		while(i<=10)
		{
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}*/
		
		//Ex4 1...10 with odd even
		
		/*int i= 1;
		while(i<=10)
		{
			if(i%2==0) {
				System.out.println(i + "Even");
			}
			else {
				System.out.println(i + "odd");
			}
			i++;
		}*/
		
		//Ex5  10....1
		int i =10;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		
	}

}
