package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
https://testautomationpractice.blogspot.com/
1) provide some string search of it
2) count number of links
3) click on each link using for loop
4) get window IDs for every browser window
5) close specific browser window
*/

public class AssignmentHandlingBrowserWindows {
	public static void main(String [] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Rozumiem']")).click();
		
		// 1) provide some string search of it
		WebElement textbox = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		textbox.sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// 2) count number of links
		List<WebElement> links = driver.findElements(By.xpath("//a[starts-with(text(),'Selenium')]"));
		System.out.println(links.size());
		
		// 3) click on each link using for loop
		for(WebElement link:links)
		{
			link.click();
		}
		
		// 4) get window IDs for every browser window
		Set <String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
		
		// 5) close specific browser window
		for(String winID:windowIDs)
		{
			String title = driver.switchTo().window(winID).getTitle();
			
			if(title.equals("Selenium - Wikipedia") || title.equals("Selenium disulfide - Wikipedia") || title.equals("Selenium dioxide - Wikipedia") )
			{
				driver.close();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
