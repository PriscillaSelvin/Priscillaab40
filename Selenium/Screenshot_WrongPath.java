package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_WrongPath {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	    TakesScreenshot  t1 = driver ;
	    File source = t1.getScreenshotAs(OutputType.FILE);
	     
	    File destination = new File ("F:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\src\\sun" + Math.random() + ".png");
	    //File destination = new File ("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\src\\" + c_name + d_name + ".png");
	    FileHandler.copy(source, destination);
	}

}
