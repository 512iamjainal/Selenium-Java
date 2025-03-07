package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		String s = "Welcome";
		
		try 
		{
			System.out.println(s.length());
		}

		catch(NumberFormatException e)
		{
			System.out.println(" catch block Handled exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Program finished");

	}

}
