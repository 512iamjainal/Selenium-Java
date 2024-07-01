package day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//finding element using name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//finding element using id
		Boolean logoDisplay_status = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplay_status);
		
		//finding element using LinkText and partialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tablets")).click();
		
		//finding elements using className
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total number of header links: "+headerLinks.size());
		
		//finding elements using tagName
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		List<WebElement>images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+images.size());

	}

}
