package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// DEclaration
		//Map mymap = new HashMap();
		HashMap <Integer, String> hm = new HashMap<Integer,String>();
		
		//adding pairs
		hm.put(101, "John");
		hm.put(101, "Smith");
		hm.put(103, "Scott");
		hm.put(102, "Mary");
		hm.put(104, "David");
		
		System.out.println(hm);
		
		//size of hashmap
		System.out.println("Size of hashmap: "+hm.size());
		
		//remove a pair
		hm.remove(104);
		System.out.println("After removing a pair : "+hm);
		
		//access a value of a key
		
		System.out.println(hm.get(101));
		
		//get all the keys from hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//reading data from hashmap
		
		//using for each
		/*for(int k:hm.keySet())
		{
			System.out.println(k+"    "+hm.get(k));
		}*/
		
		//using iterator
		
		Iterator <Entry<Integer,String>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry <Integer,String>entry = it.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		
		
	}

}
