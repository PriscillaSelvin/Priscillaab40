package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Launch amazon.in and click on customers service and click on orders and then login to the application

public class Amazon_Assgmnt {

	public static void main(String[] args) 
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.ca");
		 //driver.findElement(By.className("nav-a  ")).click();
		 //Actions a1 = new Actions(driver);
		// a1.moveToElement(driver.findElement(By.className("nav-action-inner"))).click();
		 //a1.moveToElement(driver.findElement(By.linkText("Sign in"))).click();
		 driver.findElement((By.linkText("Sign in"))).click();
		 driver.findElement(By.name("email")).sendKeys("jmselvin@yahoo.ca");
		 driver.findElement(By.className("a-button-input")).click();
				// By.className("nav-action-inner")).click();
		 
		 
				// ("Customer Service"));
		  
		 
		 
	}

}
