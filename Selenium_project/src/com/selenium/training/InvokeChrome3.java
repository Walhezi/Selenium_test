package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChrome3 {
	public WebDriver driver ; 
	
	
	//public void webdriver() {
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\C5259429\\Desktop\\Tools\\webdriver\\chromedriver_win32\\chromedriver.exe");
	//	driver = new ChromeDriver();
	//	driver.get("https://www.google.com");
		//driver.manage().window().maximize();
//	}
	@Test                                 
	public void chromeprogram() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\C5259429\\Desktop\\Tools\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement a= driver.findElement(By.linkText("Anmelden"));
		a.click();
		driver.quit();
	}	
}
