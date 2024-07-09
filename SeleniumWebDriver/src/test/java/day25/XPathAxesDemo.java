package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) {
		//
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[contains(text(),'Consent')]")).click();
		
		//Self
		String selfText = driver.findElement(By.xpath("//a[normalize-space()='Indian Railway Fin']/self::a")).getText();
		System.out.println(selfText);
		
		//Parent
		String parentText = driver.findElement(By.xpath("//a[normalize-space()='Indian Railway Fin']/parent::td")).getText();
		System.out.println(parentText);
		
		//child
		List<WebElement> children = driver.findElements(By.xpath("//a[normalize-space()='Indian Railway Fin']/ancestor::tr/child::td"));
		System.out.println("Number of children nodes: "+children.size());
		
		//ancestor
		String ancText = driver.findElement(By.xpath("//a[normalize-space()='Indian Railway Fin']/ancestor::tr")).getText();
		System.out.println(ancText);
		
		//descendant
		List<WebElement> descendants = driver.findElements(By.xpath("//a[normalize-space()='Indian Railway Fin']/ancestor::tr/descendant::*"));
		System.out.println("Number of descendants nodes: "+descendants.size());
		
		//following
		List<WebElement> following = driver.findElements(By.xpath("//a[normalize-space()='Indian Railway Fin']/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes: "+following.size());
		
		//preceding
		List<WebElement> preceding = driver.findElements(By.xpath("//a[normalize-space()='Indian Railway Fin']/ancestor::tr/preceding::tr"));
		System.out.println("Number of following nodes: "+preceding.size());
		
		//following-sibling
		List<WebElement> followingSibling = driver.findElements(By.xpath("//a[normalize-space()='Indian Railway Fin']/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following-sibling nodes: "+followingSibling.size());
		
		//preceding-sibling
		List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[normalize-space()='Indian Railway Fin']/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding-sibling nodes: "+precedingSibling.size());
		
		// 1) Finding facebook sign up button from the registration form (child)
		//div[@id='reg_form_box']/child::div[11]/button
		
		// 2) Locate first name field from the sign up button (parent)
		//button[@id='u_e_s_CS']/parent::*/parent::*/child::*/div/div[1]/div[1]/input
		
		// 3) identify password field from Mobile number field in facebook (Following)
		//input[@id='u_e_g_Nn']/following::input[2]
		
		// 4) identify Mobile number field from password field in facebook  (Preceding)
		//input[@id='password_step_input']/preceding::input[2]
		
		// 5) Locate surname from female radio button in facebook (Ancestor)
		//input[@id='u_1_4_sc']/ancestor::div[2]/div[1]/div/div[2]
		//input[@id='u_1_4_sc']/ancestor::div[2]//input[@id='u_1_d_Xh']
		
		// 6) Identify the search textbox from the google search button preset in the google search home page (parent)
		//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']/parent::*/parent::*/parent::*/div[1]
		
		// 7) Identify the Today's Deals link from the amazon search text box present in the amazon  home page. (following)
		//input[@id='twotabsearchtextbox']/following::a[@href='/deals?ref_=nav_cs_gb']
		
		// 8) Identify the Hello,sign in from the amazon search textbox present in the amazon home page (following)
		//input[@id='twotabsearchtextbox']/following::span[@id='nav-link-accountList-nav-line-1']
		
		// 9) Identify Mobiles link which is part of menu bar - Amazon (Descendant)
		//div[@id='nav-main']/descendant::a[normalize-space()='Mobiles']
		
		
		driver.quit();
	}

}
