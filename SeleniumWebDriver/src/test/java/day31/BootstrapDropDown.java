package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=' css-47sehv']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();   //opens dropdown options
		
		// 1) select single option
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		// 2) capture all options and find size
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options: " + options.size());
		
		// 3) Print options from dropdown
		/*for(WebElement op: options)
		{
			System.out.println(op.getText());
		}*/
		 
		// 4) Select multiple options
		for(WebElement op : options)
		{
			String option = op.getText();
			
			if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
			{
				op.click();
			}
		}
		
		
	}

}
