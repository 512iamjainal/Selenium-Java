package day11;

public class Greetings {
	
	//1) no params = no return value
	void m1()
	{
		System.out.println("Hello...");
	}
	
	//2) no params = returns value
	String m2()
	{
		return ("Hello how are you?");
	}
	
	//3) takes params  = no return value
	void m3(String name)
	{
		System.out.println("Hello " + name);
	}
	
	//4) takes params  = returns value
	String m4(String name)
	{
		return ("Hello " + name);
	}
	
}
