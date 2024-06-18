package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_Inputfields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");  
				driver.manage().window().maximize();
				
				WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
				if (searchField.isDisplayed() == true)
				{
					System.out.println("search field is displayed");
					searchField.clear();
					searchField.sendKeys("women dresses");
				}
				else
				{
					System.out.println("search field is missing");
				}
				
				String appTitle = driver.getTitle();
				System.out.println("Application title is "  +  appTitle );
				
				Thread.sleep(5000);
				
				searchField.clear();
				
				Thread.sleep(5000);
						 				 
				driver.quit();
				// driver.close();
			}

	}


