package day7;

public class SearchingElementInArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,30,50};
		int search_element = 30;
		
		boolean status = false;
		/*
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==search_element)
			{
				System.out.println(search_element + " is present in the array");
				status = true;
				break;
			}
		}
		*/
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println(search_element + " is present in the array");
				status=true;
				break;
			}
		}
		
		if(status==false)
		{
		System.out.println("Element not found");
		}
		
		
	}

}
