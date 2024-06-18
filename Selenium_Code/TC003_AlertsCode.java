package seleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC003_AlertsCode
{
   public static WebDriver driver = null;
   
	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
         BaseClass bc = new BaseClass();
         driver = bc.LaunchBrowser("Chrome");
         driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         driver.findElement(By.name("proceed")).click();
         Alert alert = driver.switchTo().alert();
         String altText = alert.getText();
         System.out.println("alertText "  +  altText);
         Thread.sleep(5000);
         //To click on ok button
         // alert.accept();
         //To click on Enter key
         alert.dismiss();
         driver.quit();
         
	}

}
