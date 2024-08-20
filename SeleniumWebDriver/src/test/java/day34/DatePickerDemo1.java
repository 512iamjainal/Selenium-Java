package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	// select future date
	static void selectFutureDate(WebDriver driver, String year, String month, String date) {

		while (true) {
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual
																													// month
			String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual
																													// year

			if (current_month.equals(month) && current_year.equals(year)) 
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // clicks on
																										// next
		}
			List<WebElement> allDates = driver
					.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

			for (WebElement dt : allDates) {
				if (dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
		}

	// Select past date
	
	static void selectPastDate(WebDriver driver, String year, String month, String date) {

		while (true) {
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual
																													// month
			String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual
																													// year

			if (current_month.equals(month) && current_year.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // clicks on
																										// previous
		}
			List<WebElement> allDates = driver
					.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

			for (WebElement dt : allDates) {
				if (dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
		}
	
	
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		// 1) Using sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/07/2024");

		// 2) Using datepicker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker

		String year = "2025";
		String month = "August";
		String date = "10";
		
		selectFutureDate(driver,year,month,date);

	}

}
