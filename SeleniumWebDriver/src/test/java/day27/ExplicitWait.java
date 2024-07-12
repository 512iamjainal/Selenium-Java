package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		txtusername.sendKeys("Admin");
		
		WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		txtpassword.sendKeys("admin123");
		
		WebElement btn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		btn.click();
		
		driver.close();

	}

}
