package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch Naukri.com click on register after that click on continue with google

public class Naukri_Asgnmt {

	public static void main(String[] args) 
	
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.className("nI-gNb-lg-rg__register"));
		 // class("register_Layer")).click();
		 //driver.findElement(By.id("register_Layer")).click();
	}

}
