package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Rozumiem']")).click();
		
		// 1) Select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// 2) Select all checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*  //using normal for loop
		for(int i=0; i<=checkboxes.size()-1; i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*	//using enhanced for loop
		for(WebElement checkbox : checkboxes)
		{
			checkbox.click();
		}*/
		
		
		// 3) Select last 3 checkboxes
		// total no of checkboxes - how many checkboxes want to select = starting index   => 7-3 = 4(Starting index)
		/*for(int i=4; i<=checkboxes.size()-1;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 4) Select first 3 checkboxes
		/*for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 5) Unselect selected checkboxes
		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(2000);
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		
	}

}

