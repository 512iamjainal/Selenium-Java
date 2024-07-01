package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*
 Test case
 *********************************************
 1) Launch chrome browser
 2) Open url https://demo.opencart.com/
 3) Validate title should be "Your Store"
 4) Close browser
*/ 


public class FirstTestCase {

	public static void main(String[] args) {
		
		// 1) Launch chrome browser
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();  //most preferred
		
		// 2) Open url https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		// 3) Validate title should be "Your Store"
		String actual_title = driver.getTitle();
		 
		if(actual_title.equals("Your Store"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		// 4) Close browser
		driver.quit();
		
		

	}

}
