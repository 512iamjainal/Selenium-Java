package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//Syntax: https://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
 