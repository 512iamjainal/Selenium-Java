package day3;

public class SwappingNumbers {

	public static void main(String[] args)
	{
		int a = 10, b= 20;
		
		System.out.println("Before swapping values "+a+" "+b+" ");
		
		a=a+b; // 10+20 = 30
		b=a-b; // 30-20 = 10
		a=a-b; // 30-10 = 20


		System.out.println("After swapping values "+a+" "+b+" ");
	}
}
