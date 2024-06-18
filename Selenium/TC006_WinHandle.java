package seleniumTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC006_WinHandle {
   public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BaseClass bc = new BaseClass();
		driver = bc.LaunchBrowser("Chrome");
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(3000);
          Set<String>  ids = driver.getWindowHandles();
          Iterator<String> itr = ids.iterator();
          
          String firstwnd = itr.next();
          String secodwnd = itr.next();
          
          driver.switchTo().window(secodwnd);
          
          driver.findElement(By.linkText("update these settings")).click();
          Thread.sleep(3000);
          
          driver.quit();
          
	}

}
