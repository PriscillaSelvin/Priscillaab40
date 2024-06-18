package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException
	{  
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
	 
       search.sendKeys("India");
           Thread.sleep(2000);
           List<WebElement> a1 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
             int count = a1.size();
           System.out.println(count);
           a1.get(5).click();
           
	}

}
