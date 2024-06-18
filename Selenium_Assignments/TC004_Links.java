package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_Links {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		String explink = "Create Page";
		boolean status = false;
		
         String linkname = driver.findElement(By.linkText("Forgot account?")).getText();
         System.out.println(linkname);
         List<WebElement> links = driver.findElements(By.tagName("a"));
         int nooflinks = links.size();
         System.out.println("Number of links  " + nooflinks);
         for(int i=0;i<nooflinks;i++)
         {
        	 String link_name = links.get(i).getText();
        	 System.out.println(link_name);
        	 if (link_name.equalsIgnoreCase(explink)) {
        		 status = true;
        		 break;
        	 }
        	 else
        	 {
        		 status = false;
        	 }
         }
         if (status == true)
         {
        	 System.out.println("pass");
         }
         else
         {
        	 System.out.println("fail");
         }
         Thread.sleep(5000);
         driver.quit();
         
	}

}
