package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();  //clicking on "Accept all"

		driver.findElement(By.name("q")).sendKeys("selenium");  //searching "selenium' in searchbox
		Thread.sleep(5000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='option']"));
		System.out.println("Total number of options: "+options.size());
		
		Thread.sleep(5000);
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equals("selenium python"))
			{
				options.get(i).click();
				break;
			}
		}
		
		
		
	}

}
