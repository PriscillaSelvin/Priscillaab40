package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaxon_xpathANAV {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
