package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC001_Simple {

	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver cdriver = new ChromeDriver();
       cdriver.get("https://www.mynelson.com/");
       cdriver.manage().window().maximize();
       cdriver.findElement(By.id("email")).sendKeys("selvinpriscilla@gmail.com");
       cdriver.findElement(By.id("password")).sendKeys("1GoodStudy23*");
       cdriver.findElement(By.className("btn--primary")).click();
       cdriver.wait(3000);
       cdriver.quit(); 
       
       /*WebDriver fdriver = new FirefoxDriver();
       fdriver.get("https://www.mynelson.com/");
       fdriver.manage().window().maximize();
       fdriver.wait(3000);
       fdriver.close(); */
		
		/*WebDriver edriver = new InternetExplorerDriver();
		edriver.get("https://www.mynelson.com/");
	    edriver.manage().window().maximize();
	    edriver.wait(3000);
	    edriver.g
	    edriver.close(); */
       
       
	}

}
