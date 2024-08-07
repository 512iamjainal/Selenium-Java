package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']")); 
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text = driver.findElement(By.xpath("//div[contains(text(),\"Pages\")]")).getText();
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		//repeating webpages
		for(int p=1; p<=5; p++)
		{
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
			//reading data
			int rows = driver.findElements(By.xpath("//tbody/tr")).size();
			
			for(int r=1; r<=rows; r++)
			{
				String customerName = driver.findElement(By.xpath("//tbody/tr["+r+"]/td[2]")).getText();
			
				String customerEmail = driver.findElement(By.xpath("//tbody/tr[\"+r+\"]/td[3]")).getText();
				
				String date = driver.findElement(By.xpath("//tbody/tr[\"+r+\"]/td[5]")).getText();
				
				System.out.println(customerName + "\t" + customerEmail + "\t" + date);
			}
		}
		
		
	}

}
