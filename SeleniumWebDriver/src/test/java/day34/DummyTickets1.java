package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyTickets1 {
	
	static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate)
	{
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));  //select year
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByVisibleText(requiredYear);
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@aria-label='Select month']"));  //select month
		Select selectMonth = new Select(monthDropDown);
		selectMonth.selectByVisibleText(requiredMonth);

		List<WebElement>dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td/a"));  //all dates
		
		for(WebElement dt:dates) 
		{											//selecting specific date
			if(dt.getText().equals(requiredDate)) 
			{
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='add_to_cart' and @value='549']")).click();  //ticket selection
		
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Jason");  //first name
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Momoa");  //last name
		
		//DOB datepicker
		driver.findElement(By.xpath("//input[@id='dob']")).click();  //dob
		
		String requiredYear = "1997";
		String requiredMonth = "Dec";
		String requiredDate = "5";
		
		selectDate(driver,requiredYear,requiredMonth,requiredDate);
		
		driver.findElement(By.xpath("//input[@id='sex_1' and @name='sex']")).click();  //selecting male radio
		driver.findElement(By.xpath("//input[@id='traveltype_2' and @name='traveltype']")).click(); //selecting round trip
		
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Ahmedabad");  //from city
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Delhi");  //to city
		
		//Departure date picker
		driver.findElement(By.xpath("//input[@id='departon']")).click(); 
		
		String depYear = "2024";
		String depMonth = "Aug";
		String depDate = "21";
		
		selectDate(driver,depYear,depMonth,depDate);
		
		//Return date picker
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
		
		String retYear = "2024";
		String retMonth = "Aug";
		String retDate = "25";
		
		selectDate(driver,retYear,retMonth,retDate);
		
		driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click(); //select purpose 
		driver.findElement(By.xpath("//span[@class='select2-results']//li[3]")).click();
		
		driver.findElement(By.xpath("//span[@class='woocommerce-input-wrapper']/input[@id='deliverymethod_3']")).click(); //delivery method radio 
		
		driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("Vrutik Patel");
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("5555555555");
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("vrutik.patel@ctdi.com");
		
		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Sepia 31");
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Florida");
		
		driver.findElement(By.xpath("//input[@id='billing_state']")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("02-406");
		
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='payment_method_yith-stripe']")).click();
		//driver.findElement(By.xpath("//div[@id='yith-stripe-card-number']")).sendKeys("1546 5465 4651 2444");
		
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
		
	}

}
