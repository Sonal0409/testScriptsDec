package com.qa.TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void Test1() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (16)\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();	
		//driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//click on sign button
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		// switching from webpage to alert box
		
		Thread.sleep(2000);
	
		Alert a= driver.switchTo().alert();
		 
	String errorText= a.getText();
	
	System.out.println(errorText);
	
	Thread.sleep(3000);
	
	a.accept();
	

	
		driver.close(); 
		 
	}
}
