package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTech_KeysFunctionality {

	public static void main(String[] args) throws InterruptedException
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.grotechminds.com/registration");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println("Title is  " + title);
		 WebElement first_name = driver.findElement(By.id("fname"));
		 //driver.findElement(By.name("btnK")).click();
		 //driver.findElement(By.linkText("Gmail")).click();
		 first_name.sendKeys("Manis");
		 Thread.sleep(2000);
		 first_name.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(2000);
		 first_name.sendKeys(Keys.CONTROL+"c");
		 Thread.sleep(2000);
		 //first_name.sendKeys(Keys.CONTROL+"v");
		 WebElement l_name = driver.findElement(By.id("lname"));
		 l_name.sendKeys(Keys.CONTROL + "v");
	}

}
