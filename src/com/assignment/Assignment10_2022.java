package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10_2022 
{

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(2000);
			
			//By username=By.id("username");
			WebElement Usernameloc=driver.findElement(By.id("username"));
			Usernameloc.sendKeys("admin123");
			
			WebElement password=driver.findElement(By.name("pwd"));
			password.sendKeys("abhirweirh");
			
			WebElement login=driver.findElement(By.id("loginButton"));
			login.click();
			
			Thread.sleep(2000);
			WebElement error=driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
			String color=error.getCssValue("color");
			System.out.println(color);
			
			Thread.sleep(2000);
			WebElement font=driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
			String design=font.getCssValue("font");
			System.out.println(design);
			
			String ferror="Username or Password is invalid. Please try again.";
			if(error.equals(ferror))
			{
				System.out.println("it is matching");
			}
			else 
				
				System.out.println("it is not matching");
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
}
