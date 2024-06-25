package day16;

interface Shape
{
	int length = 10; //final and static
	int width = 20;  //final and static
	
	void circle();
	
	default void square()
	{
		System.out.println("This is square...");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle");
	}
}


public class InterfaceDemo implements Shape
{
	
	public void circle() 
	{
		System.out.println("This is circle - abstract method");
	}
	
	static void triangle()
	{
		System.out.println("This is triangle");
	}
	public static void main(String[] args) {
		//scenario1
		InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle();
		idobj.square();
		Shape.rectangle();
		InterfaceDemo.triangle();
		
		//scenario2
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
	}

}
