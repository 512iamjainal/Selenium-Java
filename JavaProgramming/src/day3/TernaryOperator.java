package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// var = exp ? result1 : result2;
		
		//Ex1
		/*int a =20, b=10;
		
		int x = (a>b) ? a: b;
		System.out.println(x);   //20*/
		
		//Ex2
		/*int x = (1==1) ? 10 : 20;
		System.out.println(x);  
		
		int y = (1==2)?10:20;
		System.out.println(y);  */
		
		//Ex3
		int person_age=15;
		
		String res = (person_age>=18) ? "eligible" : "not eligible";
		System.out.println(res);
		

	}

}
