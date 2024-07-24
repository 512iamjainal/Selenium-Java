package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Rozumiem']")).click();
		
		// 1) Find total number of rows in table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();  //preferred when there are multiple tables on a web page
		//int rows = driver.findElements(By.tagName("tr")).size();                          //preferred when there is single table on a web page
		System.out.println("Number of rows: "+rows);
		
		// 2) Find total number of columns in table
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //preferred when there are multiple tables on a web page
		//int columns = driver.findElements(By.tagName("th")).size();                            //preferred when there is single table on a web page
		System.out.println("Number of columns: "+columns);

		// 3) Read data from specific row and column (ex. 4th row and 1st column)
		//String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[1]")).getText();
		//System.out.println(bookname);
		
		// 4) Read data from all rows and columns
		
		System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		/*for(int r=2; r<=rows;r++)
		{
			for(int c=1; c<=columns; c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}*/
		
		// 5) Print book names whose author is Mukesh
		/*for(int r=2; r<=rows; r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(authorName.equals("Mukesh"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName+"\t"+authorName);
			}
		}*/
		
		// 6) Find total price of all books
		
		int total = 0;
		for(int r=2; r<=rows; r++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			total = total+Integer.parseInt(price);
		}
		System.out.println("Total price of books: " + total);
	}

}
