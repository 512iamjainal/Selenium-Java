package day5;

public class ForLoop {

	public static void main(String[] args) {
		// 1.....10
		
		/*for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}*/
		
		//even numbers 1...10
		/*for(int i =2; i<=10; i+=2)
		{
			System.out.println(i);
		}*/
		
		//1...10 with odd,even
		/*for(int i = 1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "Even");
			}
			else {
				System.out.println(i + "odd");
			}
		}*/
		
		//10.....1
		for(int i = 10; i>0 ; i--)
		{
			System.out.println(i);
		}
	}

}
