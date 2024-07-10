package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		// 1) isDisplayed()
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status of logo: " + logo.isDisplayed());
		
		//boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("Display status of logo: " + status);
		
		// 2) isEnabled()
		//boolean textbox = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("Enabled status of textbox firstname: "+ textbox);
		
		// 3) isSelected()
		WebElement maleRadio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleRadio = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection:");
		System.out.println(maleRadio.isSelected());
		System.out.println(femaleRadio.isSelected());
		
		System.out.println("After selection of male radio : ");
		maleRadio.click();
		System.out.println(maleRadio.isSelected());
		System.out.println(femaleRadio.isSelected());
		
		System.out.println("After selection of female radio : ");
		femaleRadio.click();
		System.out.println(maleRadio.isSelected());
		System.out.println(femaleRadio.isSelected());
		
		boolean newsStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Status of newspaper checkbox: "+newsStatus);
		
		
	}

}
