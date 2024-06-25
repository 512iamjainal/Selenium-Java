package day19;

//Cat ct = (Cat) an;
// A   B     C    D

class Animal{}

class Dog extends Animal {}
class Cat extends Animal {}

public class TypeCastingObject2 {

	public static void main(String[] args) {
		
		//Rule 1: Conversion is valid or not
		//The type of 'D' and 'C' must have some relationship(either parent to child or child to parent
		
		//Animal an = new Dog();
		//Cat ct = (Cat) an;  //valid according to Rule 1
		
		//Dog dg = new Dog();
		//Cat ct = (Cat) dg;  // invalid according to Rule 1
		
	//--------------------------------------------------------------------------------------------------------------------------------	
		//Rule 2 : Assignment is valid or not
		//'C' must be either same or child of 'A'.
		
		//Animal an = new Dog();
		//Cat ct = (Cat) an; // valid according to Rule 2
		
		//Animal an = new Dog();
		//Cat ct = (Dog) an; // invalid according to Rule 2
 		
		
	//--------------------------------------------------------------------------------------------------------------------------------
		//Rule 3: the underlying object type of 'D' must be either same or child of 'C'
		
		//Animal an = new Dog();
		//Cat ct = (Cat) an;  //invalid according to Rule 3
		
		
		//Rule 1,2,3
		
		Animal an = new Dog();
		Dog dg = (Dog) an;   //Rule 1- YES,  Rule 2 - YES, Rule 3 - YES
		
		
	}

}
