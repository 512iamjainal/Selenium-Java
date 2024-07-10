package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// get(url) - opens the url on the browser
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"cookieChoiceDismiss\"]")).click();
		
		//get methods
		//getCurrentUrl() - returns the URL of the page
		//System.out.println(driver.getCurrentUrl());
				
		//getTitle() - returns the title of the page
		//System.out.println(driver.getTitle());
				
		//getPageSource() - returns page source of the page
		//System.err.println(driver.getPageSource());
				
		//getWindowHandle() - returns the ID of the current window
		//String windowID = driver.getWindowHandle();
		//System.out.println("Window ID is: " + windowID);
				
		//getWindowHandles() - returns IDs of multiple browser windows
		//driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		//Set <String> windowIDs = driver.getWindowHandles();
		//System.out.println(windowIDs);
		
		//conditional methods
		// 1) isDisplayed()
		//WebElement logo = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		//System.out.println(logo.isDisplayed());
		
		// 2) isEnabled()
		//boolean textboxStatus = driver.findElement(By.xpath("//*[@id=\"name\"]")).isEnabled();
		//System.out.println(textboxStatus);
				
		// 3) isSelected()
		/*WebElement maleRadio = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement femaleRadio = driver.findElement(By.xpath("//input[@id='female']"));
		
		System.out.println("Before selecting any radio...");
		System.out.println(maleRadio.isSelected());
		System.out.println(femaleRadio.isSelected());
		
		System.out.println("After selecting male radio...");
		maleRadio.click(); 
		System.out.println(maleRadio.isSelected());
		System.out.println(femaleRadio.isSelected());
		
		System.out.println("After selecting female radio...");
		femaleRadio.click(); 
		System.out.println(maleRadio.isSelected());
		System.out.println(femaleRadio.isSelected());*/
		
		//Browser methods
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		
		//driver.close();
		driver.quit();
		
		
		
		
		
		
	}

}
