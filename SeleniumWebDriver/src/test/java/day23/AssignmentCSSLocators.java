package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentCSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//finding element using tag class   --->   tag.classname
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("Canon");
		
		//finding element using tag attribute  --->   tag[attribute=""]
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Canon");
		
		//finding element using tag class attribute ---> tag.classname[attribute=""]
		driver.findElement(By.cssSelector("input.form-control[name=\"search\"]")).sendKeys("Canon");
		
	}

}
