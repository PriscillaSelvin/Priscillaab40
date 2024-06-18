package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_KeysFunctinality {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");		  
		 WebElement wemt_search = driver.findElement(By.id("searchDropdownBox"));
		 wemt_search.sendKeys(Keys.ARROW_DOWN + "Books");
		 Thread.sleep(3000);
		 wemt_search.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 driver.findElement(By.name("field-keywords")).sendKeys("world War");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Thread.sleep(8000);
		 driver.close();
	}

}
