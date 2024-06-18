package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_page {

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/pasel/OneDrive/Documents/Learning/Java-Selenium/GroTechMinds/learningHTML1.html");
		 driver.manage().window().maximize();
		 WebElement un = driver.findElement(By.xpath("(html/body/input)[1]"));
				 un.sendKeys("selvinpriscilla@gmail.com");
				 WebElement hint = driver.findElement(By.xpath("(//input)[2]"));	 
                 hint.sendKeys("name");
                  WebElement password = driver.findElement(By.xpath("(//input)[3]"));	 
                  password.sendKeys("Prisci123");
                  WebElement fname = driver.findElement(By.xpath("(//input[@name='fname'])"));	 
                  fname.sendKeys("Priscilla");
                  WebElement lname = driver.findElement(By.name("lname"));
                  boolean b1 = lname.isDisplayed();
                  boolean b2 = lname.isEnabled();
                  if (b1 && b2)
                  {
                	  lname.sendKeys("Selvin");
                  }
                		  
                 Thread.sleep(3000);
                		  WebElement boy_check = driver.findElement(By.xpath(" (//input[@name='name1'])"));	 
                          boy_check.click();
                          Thread.sleep(3000);
                  WebElement female_radio = driver.findElement(By.xpath("(html/body/input)[5]"));	 
                  female_radio.click();
                  Thread.sleep(3000);
                  WebElement submit_btn = driver.findElement(By.xpath("(//input[@value='Submit'])"));	 
                  submit_btn.click();
	}

}
