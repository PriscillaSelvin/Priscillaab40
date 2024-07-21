package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_CustomerService {

	public static void main(String[] args) throws InterruptedException
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("Customer")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.className("ss-v2-box-image")).click();
		 /* Actions a1 = new Actions(driver);
		 a1.moveToElement(driver.findElement(By.className("a-spacing-none a-text-normal"))).click();
		 a1.moveToElement(driver.findElement(By.linkText("Sign in"))).click();
		 driver.findElement((By.linkText("Sign in"))).click();
		 driver.findElement(By.name("email")).sendKeys("prisci_29@yahoo.com");
		 driver.findElement(By.className("a-button-input")).click();
				// By.className("nav-action-inner")).click(); */
		 
	}

}
