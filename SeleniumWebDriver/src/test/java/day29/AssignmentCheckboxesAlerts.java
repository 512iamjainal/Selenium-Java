package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentCheckboxesAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Rozumiem']")).click();
		
		//handling checkboxes
		// 1) Select specific checkbox
		//driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		
		// 2) Select all checkboxes
		//List<WebElement>checkboxes = driver.findElements(By.xpath("//tbody/tr/td[4]/input[1]"));
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		/*for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 3) Last 3 checkboxes
		/*for(int i=2; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 4) First 3 checkboxes
		/*for(int i=0; i<3;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		// 5) Unselect selected checkboxes
		/*for(int i=0; i<3;i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(2000);
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}*/
		
		//Alerts
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		//Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		//Alert myalert = driver.switchTo().alert();
		//myalert.accept();
		
		//driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		//Alert prompt = driver.switchTo().alert();
		//prompt.sendKeys("Hello prompt");
		//prompt.accept();
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		
	}

}
