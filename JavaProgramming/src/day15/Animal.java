package day15;

public class Animal {

	String color = "white";
	
	void eat()
	{
		System.out.println("Eating....");
	}
}
 
class Dog extends Animal
{
	String color = "Black";
	
	void displayColor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		super.eat();
		//System.out.println("Eating bread");
	}
}