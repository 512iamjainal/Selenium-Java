package day5;

public class AssignmentControlStatements {

	public static void main(String[] args) {
		// 1. Reverse a number (% / = operators)          
		//    input 1234, output 4321
		
				/*int num = 1234;
				int revNum = 0;
				
				while(num!=0)
				{
					revNum = revNum*10 + num%10;
					num = num/10;
				}
				System.out.println("Reversed number is: " + revNum);*/
		
		 
		// 2. Palindrome number         input 121, after reversing 121
				
				/*int num = 121;
				int inputNumber = num;
				int rev = 0;
				
				while(num!=0)
				{
					rev = rev*10 + num%10;
					num = num/10;
				}
				
				if(num==rev)
				{
					System.out.println(inputNumber + " is a palindrome number");
				}
				else
				{
					System.out.println(inputNumber + " is not  a palindrome number");
				}*/
		
		//3. Count number of digits in a number          input 423424     , output 6
				/*int num = 423424;
				int count = 0;
				
				while(num!=0)
				{
					num = num/10;
					count++;
				}
				System.out.println("There are "+count+" digits in given number");*/
		
		// 4. Count number of even and odd digits        input 23456     output: 3 even 2 odd
		
		
				/*int num = 23456;
				int even_count = 0;
				int odd_count = 0;
				
				while(num!=0)
				{
					int remainder = num%10;
					
					if(remainder%2==0)
					{
						even_count++;
					}
					else
					{
						odd_count++;
					}
					num = num/10;
				}
				System.out.println("Even numbers: "+even_count+ " Odd numbers: "+odd_count);*/
				
				
		
		// 5. find sum of digits in a number               input 1234  , output 10

				int num = 1234;
				int sum = 0;
				
				while(num!=0)
				{
					sum = sum + num%10;
					num = num/10;
				}
				System.out.println("Sum of the digits is: " + sum);
				
				
				
	}

}
