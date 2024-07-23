package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDropDown3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id='colors']")).click();  //clicked on dropdown box
		
		//select one option
		//driver.findElement(By.xpath("//option[@value='red']")).click();  //clicked red
		
		//count total num of options
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='colors']/option"));
		System.out.println("Total number of options: "+options.size());
		
		//print all options
		for(WebElement option: options)
		{
			System.out.println(option.getText());
		}
		
		//select all options
		for(WebElement option: options)
		{
			String op = option.getText();
			
			if(op.equals("Red") || op.equals("Yellow") || op.equals("White") || op.equals("Blue")) {
				option.click();
			}
			
		}
		
		
		
	}

}
