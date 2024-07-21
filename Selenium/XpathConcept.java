package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathConcept {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BaseClass bc = new BaseClass();
		driver = bc.LaunchBrowser("Chrome");
		
		driver.get("https://www.facebook.com/login/");
		//tagname [@attributename = 'attributevalue']
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("manoba@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("ghfvgtrdfr23");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.quit();		
	}

}
