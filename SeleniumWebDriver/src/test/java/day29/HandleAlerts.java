package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// 1) Normal alert with Ok button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();*/
		
		// 2) Alert with OK / Cancel
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		// 3) Prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert myprompt = driver.switchTo().alert();
		Thread.sleep(2000);
		myprompt.sendKeys("Hello alert");
		myprompt.accept();
	
	}

}
