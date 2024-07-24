package seleniumTopics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Google_Links {

	public static void main(String[] args) throws IOException 
	{
		 ChromeDriver driver = new ChromeDriver();
		 
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      //driver.get("https://www.amazon.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
List <WebElement> alllinks = driver.findElements(By.tagName("a"));
  TakesScreenshot  t1 = driver ;
  File source = t1.getScreenshotAs(OutputType.FILE);
  Google_Links g1 = new Google_Links();
  //File destination = new File ("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\src\\sun" + Math.random() + ".png");
  File destination = new File ("C:\\Users\\pasel\\OneDrive\\Documents\\Learning\\Java-Selenium\\Java Programs workspace\\SeleniumProject\\src\\" + g1.getClass() + Math.random() + ".png");
  
  FileHandler.copy(source, destination);
  
  
   for (int i=0; i<alllinks.size(); i++)
   {
	   WebElement a1 = alllinks.get(i);
	   //String url =a1.getAttribute("href");
	   String textmsg = a1.getText();
	   //System.out.println(url);
	   System.out.println(textmsg);
   }
}
}