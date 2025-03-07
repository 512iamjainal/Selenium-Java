package day11;

public class Constructor {
	
	int x,y;
	
	Constructor()              //default
	{
		x=100;
		y=200;
	}
	
	Constructor(int a,int b)    //parameterized
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		Constructor c = new Constructor ();
		c.sum();
		
		

	}

}
