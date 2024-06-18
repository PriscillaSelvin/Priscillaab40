package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver_Class {
 
	public static void main(String[] args) throws InterruptedException 
	
	{
		/*ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 Thread.sleep(3000);
		 driver.close();*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id ='search']"));
	 
           search.sendKeys("NarendraModi");
           driver.findElement(By.id("search-icon-legacy")).click();
           Thread.sleep(2000);
            WebElement e1 = driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']"));
             e1.click();
	}

}
