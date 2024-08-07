package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDynamicTables1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Rozumiem')]")).click();
		
		//div[@class='table-container']//tbody//tr
		
		for(int p=1; p<=4; p++)
		{
			if(p>1)
			{
				WebElement active_page = driver.findElement(By.xpath("//a[normalize-space()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
			//reading data
			int rows = driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr")).size();
			
			for(int r=1; r<=rows; r++) 
			{
				String id = driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+r+"]/td[1]")).getText();
				
				String name = driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+r+"]/td[2]")).getText();
				
				String price = driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+r+"]/td[3]")).getText();
				
				WebElement checkbox = driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+r+"]/td[4]/input"));
				checkbox.click();
				
				System.out.println(id + "\t" + name + "\t" + price);	
			}	
		}
	}

}
