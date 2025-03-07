package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList <Integer>mylist = new ArrayList<Integer>();

		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of an arraylist
		System.out.println(mylist.size());
		
		//Printing arraylist
		System.out.println("Printing arraylist: "+mylist);
		
		//removing an element 
		mylist.remove(5);
		System.out.println("Printing arraylist after removing: "+mylist);
		
		//insert element in arraylist
		mylist.add(2, "Java");
		System.out.println("Printing arraylist after inserting: "+mylist);
		
		//modify the element
		mylist.set(2, "Python");
		System.out.println("Printing arraylist after modifying: "+mylist);
		
		//accessing specific element
		System.out.println(mylist.get(3));
		
		//reading all elements from  for loop
		
		//using normal for loop
		
		/*for(int i=0; i<=mylist.size()-1; i++)
		{
			System.out.println(mylist.get(i));
		}*/
		
		//using for each
		/*for(Object x:mylist)
		{
			System.out.println(x);
		}*/
		
		//using iterator
		Iterator it = mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		
		//Checking if arraylist is empty or not
		
		System.out.println(mylist.isEmpty());
		
		//remove all elements from arraylist
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		mylist2.add(null);
		mylist2.add(null);
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements: "+mylist);
		
		//clear all elements
		mylist.clear();
		System.out.println("Is arraylist empty? "+mylist.isEmpty());
		
		
		
	}

}
