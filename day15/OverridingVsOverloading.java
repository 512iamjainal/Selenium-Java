package day15;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)   // overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b)  // overloading
	{
		System.out.println(a+b);
	}
}


public class OverridingVsOverloading {

	public static void main(String[] args) {
		XYZ x = new XYZ();
		x.m1(10);
		x.m2(100);
		x.m2(10, 20);
		

	}

}
