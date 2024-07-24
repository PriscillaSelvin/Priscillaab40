package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 String title = driver.getTitle();
		 //driver.findElement(By.linkText("Gmail")).click();
		 driver.findElement(By.partialLinkText("Ima")).click();
		 System.out.println(title);
		 Thread.sleep(3000);
		 driver.close();

	}

}
