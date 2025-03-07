package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//declaration
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		//HashSet <String>myset = new HashSet<String>();
		
		//adding elements in a hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("String");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//print hashset
		System.out.println(myset);
		
		//remove element
		myset.remove(10.5);
		System.out.println(myset);
		
		//insert element - not possible
		
		//accessing specific element - not possible
		
		//convert HashSet ==> ArrayList
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(3));
		
		//read all elements using for each
		/*for(Object x: myset)
		{
			System.out.println(x);
		}*/
		
		Iterator <Object> it = myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		 
		//clearing all elements in hashset
		
		myset.clear();
		
		

	}

}
