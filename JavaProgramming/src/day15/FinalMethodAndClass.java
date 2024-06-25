package day15;

//final class Test1
class Test1
{
	//final void m()
	void m()
	{
		System.out.println("This is m method from Test1");
	}
}

class Test2 extends Test1 //incorrect because Test1 is final class 
{
	void m()  // incorrect because m is final method
	{
		System.out.println("This is m method from Test2");
	}
}

public class FinalMethodAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
