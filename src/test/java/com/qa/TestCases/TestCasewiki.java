package com.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCasewiki {
	
	@Test
	public void test1() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();		
		
driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		
		driver.manage().window().maximize();	
		
	WebElement l1=	driver.findElement(By.linkText("Main page"));
	
	l1.isDisplayed();
	l1.isEnabled();
	l1.click();
	
	Thread.sleep(3000);
	System.out.println("Title of main page: " + driver.getTitle());  // title of main mapge
	
	driver.navigate().back();

	Thread.sleep(3000);
	
	System.out.println("Title of the page is: " + driver.getTitle()); 	// create account page
	
	WebElement l2= driver.findElement(By.linkText("About Wikipedia"));
	
	
	l2.isDisplayed();
	l2.isEnabled();
	l2.click();
	
	Thread.sleep(3000);
		
	System.out.println("Title of the page is: " + driver.getTitle()); // about wikipedia
	
	driver.close();
		
	}

}
