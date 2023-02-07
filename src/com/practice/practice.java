package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice
{
	WebDriver driver;
	public static void main(String[] args) 
	{
		practice pr=new practice();
		//pr.fliplart();
		pr.actitime();
		
	}
	public void fliplart()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		m1();
	}
	public void m1()
	{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	public void actitime()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//am1();
	}
	public void am1()
	{
		//driver.findElement(By.)
		
	}

}
