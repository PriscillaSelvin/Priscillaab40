package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_GetCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/"); //invoke the url
		driver.manage().window().maximize();
		String appTitle = driver.getTitle();
		System.out.println("Application title is "  +  appTitle );
		Thread.sleep(10000);
			
		String appurl = driver.getCurrentUrl();
		System.out.println(appurl);
		if (appurl.indexOf("google")>=0) 
		{
			System.out.println("google is present in the url");
	}
	else
	{
		System.out.println("not present");
	}
		if (appurl.contains("google")) {
			System.out.println("google is present in the url");
		}
		else
		{
			System.out.println("not present");
		}
           
		//driver.quit();
		driver.close();
	}

}
