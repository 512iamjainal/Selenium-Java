package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);	
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//driver.close();  //closes single browser window where the driver is focused
		driver.quit();     //closes all the browser windows
	}

}
