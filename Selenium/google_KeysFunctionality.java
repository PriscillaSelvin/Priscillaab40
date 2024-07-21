package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_KeysFunctionality {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		  
		 WebElement wemt_search = driver.findElement(By.className("gLFyf"));
		 //driver.findElement(By.name("btnK")).click();
		 //driver.findElement(By.linkText("Gmail")).click();
		 wemt_search.sendKeys("India");
		 Thread.sleep(3000);
		 wemt_search.sendKeys(Keys.ENTER);
		 Thread.sleep(8000);
		 driver.close();
	}

}
