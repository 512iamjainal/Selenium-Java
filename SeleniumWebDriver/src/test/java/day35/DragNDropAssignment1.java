package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropAssignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//drag and drop
		WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
		/*
		//double click
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("Welcome");
		
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		
		if(box1.getAttribute("value").equals("Welcome"))
		{
			System.out.println("Text copied successfully");
		}
		else
		{
			System.out.println("Text copying failed");
		}
		*/
	}

}
