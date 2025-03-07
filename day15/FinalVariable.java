package day15;

class Test
{
	final int a = 10;
}

public class FinalVariable {

	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		//t.a = 100; //incorrect because a is final variable
		
		System.out.println(t.a);

	}

}
