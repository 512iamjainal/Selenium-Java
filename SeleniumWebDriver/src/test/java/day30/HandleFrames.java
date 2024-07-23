package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // passed frame as web element //switch to frame1
		driver.findElement(By.name("mytext1")).sendKeys("Hello Jai");

		driver.switchTo().defaultContent(); // switch to main page

		// Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); // passed frame as web element //switch to frame2
		driver.findElement(By.name("mytext2")).sendKeys("Hello Panchal");

		driver.switchTo().defaultContent(); // switch to main page

		// Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3); // passed frame as web element //switch to frame3
		driver.findElement(By.name("mytext3")).sendKeys("Hello Baapu");

		// inner iframe - part of frame3
		driver.switchTo().frame(0); // switching to frame using index
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();

		WebElement radiobtn = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", radiobtn);
		
		driver.switchTo().defaultContent(); // switch to main page
		
		//Frame 4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("Hello Mitul");
		
		driver.switchTo().defaultContent(); // switch to main page
		
		//Frame 5
		/*
		WebElement frame5 = driver.findElement(By.cssSelector("frame[src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.name("mytext5")).sendKeys("Hello Modi");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);
		WebElement logo = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"));
		System.out.println(logo.isDisplayed());
		*/
	}

}
