package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);		
		
		//getCurrentUrl() - returns the URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getTitle() - returns the title of the page
		System.out.println(driver.getTitle());
		
		//getPageSource() - returns page source of the page
		//System.err.println(driver.getPageSource());
		
		//getWindowHandle() - returns the ID of the current window
		//String windowID = driver.getWindowHandle();
		//System.out.println("Window ID is: " + windowID);
		
		//getWindowHandles() - returns IDs of multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set <String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
		
	}

}
