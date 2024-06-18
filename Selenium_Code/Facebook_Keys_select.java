package Assignments;
//Launch the facebook registration and enter your fname lname your emailed your pwd
//Your dob , gender

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Keys_select {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priscilla") ;
		String pid=		driver.getWindowHandle();
    	Set<String> pandcid=	driver.getWindowHandles();
    	System.out.println(pid);
    	System.out.println(pandcid);
   		Iterator<String> pc=			pandcid.iterator();
    	String parentid=		pc.next();
    	String childid=		pc.next();
    		System.out.println(parentid);
    		System.out.println(childid);
    		driver.switchTo().window(childid);
    		//driver.manage().window().maximize();
				driver.findElement(By.name("firstname")).sendKeys("Priscilla") ;
				driver.findElement(By.name("lastname")).sendKeys("Selvin") ;
				driver.findElement(By.name("reg_email__")).sendKeys("prisci_29@yahoo.com") ;
				driver.findElement(By.id("password_step_input")).sendKeys("29prisciselvin*") ;
				WebElement wemt_month = driver.findElement(By.name("birthday_month"));
				Select select_month = new Select(wemt_month);
				WebElement wemt_day = driver.findElement(By.name("birthday_day"));
				Select select_day = new Select(wemt_day);
				WebElement wemt_year = driver.findElement(By.name("birthday_year"));
				Select select_year = new Select(wemt_year);
				select_month.selectByIndex(3);
				select_day.selectByValue("29");
				select_year.selectByVisibleText("1985");
		 
		//Thread.sleep(7000);
        //driver.close();

	}

}
