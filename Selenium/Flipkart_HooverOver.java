package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_HooverOver {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		// driver.findElement(By.className("nav-a  ")).click();
		 Actions a1 = new Actions(driver);
		 a1.moveToElement(driver.findElement(By.xpath("//span [.='Fashion']")));
		 a1.moveToElement(driver.findElement(By.linkText("Men's T-Shirts"))).click();
		 //driver.findElement((By.linkText("Sign in"))).click();

	}

}
