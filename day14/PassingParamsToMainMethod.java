package day14;

public class PassingParamsToMainMethod {

	public static void main(String args[]) {
		
		System.out.println(args.length);
		
		for(String values:args)
		{
			System.out.println(values);
		}

	}

}
