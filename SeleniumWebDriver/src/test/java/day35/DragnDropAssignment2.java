package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropAssignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//1
		WebElement amount2 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[1]//a[1]"));
		WebElement amount2_target = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		act.dragAndDrop(amount2, amount2_target).build().perform();
		
		//2
		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement bank_target = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		act.dragAndDrop(bank, bank_target).build().perform();
		
		//3
		WebElement amount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[1]//a[1]"));
		WebElement amount_target = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		act.dragAndDrop(amount, amount_target).build().perform();
		
		//4
		WebElement sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement sales_target = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		act.dragAndDrop(sales, sales_target).build().perform();
		
		
	}

}
