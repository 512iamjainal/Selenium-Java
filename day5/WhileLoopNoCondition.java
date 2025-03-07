package day5;

public class WhileLoopNoCondition {

	public static void main(String[] args) {

		int i = 0;
		
		while(true)
		{
			System.out.println("Hey");
			i++;
			
			if(i==10)
			{
				break;
			}
		}

	}

}
