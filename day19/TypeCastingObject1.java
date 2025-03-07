package day19;

class Parent
{
	 String name = "John";
	 
	 void m1()
	 {
		 System.out.println("This is m1 from parent");
	 }
}

class Child extends Parent
{
	int id = 101;
	void m2()
	{
		System.out.println("This is m2 from child");
	}
}

public class TypeCastingObject1 {

	public static void main(String[] args) {
		
		/*Child c = new Child();
		System.out.println(c.name);  //parent
		c.m1();
		System.out.println(c.id);  //child
		c.m2();*/
		
		/*Parent p = new Child();   //upcasting
		System.out.println(p.name);   //parent
		p.m1();
		System.out.println(p.id);    //child   we cannot access
		p.m2()*/
		
		//downcasting
		/*Parent p = new Parent();
		Child c = (Child) p;
		c.m1();
		c.m2();
		System.out.println(c.id);
		System.out.println(c.name);*/   // not possible because variables cannot be accessed
		
		
	}

}
