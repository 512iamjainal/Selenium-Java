package day13;

public class StaticMain {
	
	public static void main(String[] args) 
	{
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);   //cannot access , b is non-static
		sd.m2();   //cannot access, m2() is non-static
		
		sd.m();
	}

}
