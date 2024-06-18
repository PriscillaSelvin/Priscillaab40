package seleniumTopics;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Switch_Wndows_Control {

	public static void main(String[] args) throws InterruptedException
	{
		         
        ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.in");
    	driver.manage().window().maximize();
    	WebElement serach=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    	serach.sendKeys("shoe");
    	Thread.sleep(3000);
    	serach.sendKeys(Keys.ENTER);
    	WebElement firstshoe=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
    	Thread.sleep(2000);
    	firstshoe.click();
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
    		driver.manage().window().maximize();
    		Thread.sleep(7000);
    		driver.close();
     }

}
