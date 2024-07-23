package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpcountry = new Select(drpcountryEle);
		
		//select option from the dropdown
		//drpcountry.selectByVisibleText("France");
		//drpcountry.selectByValue("germany");
		//drpcountry.selectByIndex(8);
		
		//capture options from dropdown
		List<WebElement> options = drpcountry.getOptions();
		System.out.println("Numbers of options: "+options.size());
		
		//print options in console
		/*for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText()); 
		}*/
		
		for(WebElement option:options)
		{
			System.out.println(option.getText()); 
		}
		
		
	}

}
