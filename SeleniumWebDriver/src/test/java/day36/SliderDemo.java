package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]")).click();
		
		Actions act = new Actions(driver);
		
		//miminum slider
		WebElement minimum_slider = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of minimum slider default location = "+minimum_slider.getLocation());  //(59, 251) = (x, y)
		act.dragAndDropBy(minimum_slider, 100, 251).build().perform();
		System.out.println("Location of minimum slider after moving = "+minimum_slider.getLocation());  //(158, 251);

		//maximum slider
		WebElement maximum_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of maximum slider default location = "+maximum_slider.getLocation());   //(766, 251)
		act.dragAndDropBy(maximum_slider, -100, 251).build().perform();
		System.out.println("Location of maximum slider after moving = "+maximum_slider.getLocation());  //(667, 251)
		
	}

}
