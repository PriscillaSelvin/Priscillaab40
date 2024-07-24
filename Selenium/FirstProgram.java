package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram

{

	public static void main(String[] args)
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 String title = driver.getTitle();
		 System.out.println("Title is  " + title);
		 WebElement search = driver.findElement(By.name("q"));
		 //driver.findElement(By.name("btnK")).click();
		 //driver.findElement(By.linkText("Gmail")).click();;
         search.sendKeys(Keys.ENTER);
         
	}

}
