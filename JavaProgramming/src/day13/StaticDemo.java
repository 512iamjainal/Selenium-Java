package day13;

public class StaticDemo {
	
	static int a=10; //static variable
	int b=20;        //non-static variable
	
	static void m1()  // static
	{
		System.out.println("This is a static method");
	}
	void m2()  // non-static
	{
		System.out.println("This is a non-static method");
	}
	void m() // non-static
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	/*public static void main(String[] args) 
	{
		System.out.println(a);
		m1();
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);   //cannot access , b is non-static
		sd.m2();   //cannot access, m2() is non-static
		
		sd.m();
	}*/

}
