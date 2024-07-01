package day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Open application https://www.demoblaze.com/index.html
 1) Total number of links
 2) Total number of images
 3) Click on any product using linkText/partialLinkText
 */


public class AssignmentLocator1 {

	public static void main(String[] args) {
		// Inwoking the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //maximizing window
				
		//opening "https://www.demoblaze.com/index.html"
		driver.get("https://www.demoblaze.com/index.html");
		
		//getting total number of links
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+ links.size());
		
		//getting total number of images
		List<WebElement>images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+ images.size());
		
		//clicking a product using linkText/partialLinkText
		//driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		
		//closing driver
		driver.quit();

	}

}
