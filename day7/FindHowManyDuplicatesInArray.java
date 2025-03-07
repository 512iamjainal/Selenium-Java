package day7;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		
		int a[]= {100,200,100,300,100,400,100,200};
		int num=200;
		int count=0;
		
		for(int i=0; i<=a.length-1; i++) 
		{
			if(a[i]==num)
			{
				count++;
			}
		}
		System.out.println(num+ " is repeated "+count+ " times");
	}

}
