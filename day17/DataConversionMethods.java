package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		// String to int
		
		//String s = "welcome"; //cannot convert to int
		/*String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		*/
		
		// String to double
		/*String s1 = "10.5";
		String s2 = "20.6";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));*/
		
		// String to boolean
		
		/*String s = "welc";
		System.out.println(Boolean.parseBoolean(s));*/
		
		
		//int,double,bool,char ---> String
		
		int a =10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(bool));
		
	}

}
