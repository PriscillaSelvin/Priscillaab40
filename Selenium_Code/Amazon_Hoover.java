package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hoover {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		// driver.findElement(By.className("nav-a  ")).click();
		 Actions a1 = new Actions(driver);
		 a1.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1")));
			//	 className("nav-action-inner"))).click();
		 //a1.moveToElement(driver.findElement(By.linkText("Sign in"))).click();
		 driver.findElement((By.linkText("Sign in"))).click();

	}

}
