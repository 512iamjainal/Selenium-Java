package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDropDown1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/dropdown-with-search-using-jquery/");
		driver.manage().window().maximize();
		
		//click on dropdown
		driver.findElement(By.xpath("//span[@id='select2-country-container']")).click();  
		
		//select single option
		//driver.findElement(By.xpath("//li[normalize-space()='Indonesia']")).click();
		
		//count total number of options
		List<WebElement> options = driver.findElements(By.xpath("//span[contains(@class,'select2-results')]//li"));
		//System.out.println("Number of options: " + options.size());
		
		//print all
		for(WebElement option : options)
		{
			System.out.println(option.getText());
		}
	}

}
