package day21;

/*
Test case
*********************************************
1) Launch Edge browser
2) Open url https://demo.nopcommerce.com/
3) Validate title should be "nopCommerce demo store"
4) Close browser
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver; 

public class Assignment {

	public static void main(String[] args) {
		
		// 1) Launch edge browser
		WebDriver driver = new EdgeDriver();
		
		// 2) Open url https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		// 3) Validate title should be "nopCommerce demo store"
		
		String actual_title = driver.getTitle();
		
		if(actual_title.equals(actual_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		// 4) Close browser
		driver.close();
		

	}

}
