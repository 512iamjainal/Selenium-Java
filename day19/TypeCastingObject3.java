package day19;

//A b = (C) d;
public class TypeCastingObject3 {

	public static void main(String[] args) {
		
		//EX1
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o;  //Rule 1 - YES, Rule 2- YES, Rule 3 - NO
		
		//EX2
		//String s = new String("welcome");
		//StringBuffer sb = (StringBuffer) s;  //Rule 1- NO
		
		//EX3
		//Object o = new String("Welcome");
		//StringBuffer sb = (String) o;  //Rule 1 - YES , Rule 2 - NO
		
		//EX4
		//String s = new String("Welcome");
		//StringBuffer sb = (String) s;    //Rule 1 - YES , Rule 2 - NO
		
		//EX5
		Object o = new String("welcome");
		String s = (String) o;  //Rule 1 - YES, Rule 2 - YES, Rule 3 - YES
		System.out.println(s);
		
		
		
	}

}
