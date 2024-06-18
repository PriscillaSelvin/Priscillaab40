package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup

{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://grotechminds.com/javascript-popup/");
		 WebElement search = driver.findElement(By.xpath("//button[.='Click ']"));
         search.click();
         Thread.sleep(3000);
         driver.switchTo().alert().accept();
         driver.switchTo().
	}

}


