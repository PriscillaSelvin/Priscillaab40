package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/registration/createAccount");
		 driver.manage().window().maximize();
		 WebElement search_google = driver.findElement(By.xpath("(//span[.='Google'])"));
		 Thread.sleep(3000);
				 search_google.click();

	}

}
