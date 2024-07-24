package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import seleniumTopics.Google_Links;

public class Screenshot_Date {

	public static void main(String[] args) throws IOException
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	    TakesScreenshot  t1 = driver ;
	    File source = t1.getScreenshotAs(OutputType.FILE);
	    System.out.println("date  " + getDate());
	    Screenshot_Date g1 = new Screenshot_Date();
	    String c_name = g1.getClass().toString().substring(18);
	    String d_name = getDate();
	    //File destination = new File ("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\src\\sun" + Math.random() + ".png");
	    File destination = new File ("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\src\\" + c_name + d_name + ".png");
	    FileHandler.copy(source, destination);
	}
	
	static String getDate()
	{
		 Date d1 = new Date();
		 Date d2 = new Date(d1.getTime());
		 String date_string = d2.toString();
		 System.out.println(date_string);
	     String month = date_string.substring(4,7);
	     String date = date_string.substring(8,9);
	     String year = date_string.substring(date_string.length()-5);
	     String new_date =  month.concat(date).concat(year);
	     return new_date; 
	}

}
