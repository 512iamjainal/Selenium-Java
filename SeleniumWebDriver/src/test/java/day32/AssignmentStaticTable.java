package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentStaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//selecting departure city
		WebElement depCityEle = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select departure = new Select(depCityEle);
		departure.selectByValue("Boston");
		
		//selecting destination city
		WebElement desCityEle = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select destination = new Select(desCityEle);
		destination.selectByValue("Dublin");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();  //clicking on Find flights
		
		//getting all rows and columns
		int rows = driver.findElements(By.xpath("//tbody//tr")).size();
		
		int columns = driver.findElements(By.xpath("//tbody//th")).size();
		
		//clicking and printing all prices
		ArrayList<String> allPricesList = new ArrayList<>();

		for (int r = 1; r <=rows; r++) 
		{
		    String prices = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[6]")).getText();
		    allPricesList.add(prices);  //adding all prices into the ArrayList
		}
		
		Collections.sort(allPricesList);  //sorting prices
		String lowestPrice = allPricesList.get(0);  //selecting the lowest price which is first in the arrayList
		
		for (int r = 1; r <= rows; r++) {
		    String prices = driver.findElement(By.xpath("//tbody//tr[" + r + "]//td[6]")).getText();
		    
		    if (prices.equals(lowestPrice)) {
		        driver.findElement(By.xpath("//tbody//tr[" + r + "]//input[@type='submit']")).click();   //clicking on the flight with cheapest price
		        break; 
		    }
		}
		
		//form
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Jason Momoa");  // name
		
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("1 jason beach");  //address
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Florida");  //city
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("California");  //state
		
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("45-678"); //zipcode
		
		WebElement cardEle = driver.findElement(By.xpath("//select[@id='cardType']"));  //select card
		Select card = new Select(cardEle);
		card.selectByValue("dinersclub");
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("2354684451651549485"); //card number
		
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Jason Momoa"); //name on card
		
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click(); //clicking checkbox
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click(); //clicking purchase flight button
		
		//validating purchase message
		String message = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		
		if(message.equals("Thank you for your purchase today!"))
		{
			System.out.println("Successfully purchased the flight :)");
		}
		else
		{
			System.out.println("Something went wrong :(");
		}
		
		driver.close();
		

		
		
		
	}

}
