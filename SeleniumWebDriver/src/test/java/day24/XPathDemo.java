package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//XPath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");

		//XPath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//XPath with 'and' / 'or' operators
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirts");  //both attributes have to be correct
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Srch']")).sendKeys("T-shirts");  //at least one attribute has to be correct
	
		//XPath using text() - inner text
		//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		//boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displayStatus);
		
		//String text = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(text);
		
		//XPath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		//XPath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
	}

}
