package com.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	// TestNG framework --to execute the testcases, organize test cases, 
	//execute test cases parallely
	
	//Test Case: open chromebrowser
	//2. Enter required URL on the browser
	//3. enter username in textbox, enter password,re enter passwrd, enter email
			// wait for 3 sec
	//click on main page link
			// wiat for 3 sec
			//close the browser
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		
	    driver  = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
	}
	@Test
	public void wikiPage() throws InterruptedException     // Test Method
	{
	
      driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("sonal");
      driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("abc@123");
      driver.findElement(By.xpath("//input[@id='wpRetype']")).sendKeys("abc@123");
      driver.findElement(By.xpath("//input[@id='wpEmail']")).sendKeys("email@gmail.com");   
		Thread.sleep(2000);
	}
	@Test
	public void wikiPage2() throws InterruptedException
	{
		
		driver.findElement(By.linkText("Main page")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
}
