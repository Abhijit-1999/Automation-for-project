package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
	WebElement box=driver.findElement(By.id("keepLoggedInCheckBox"));
	if(box.isSelected())
	{
		System.out.println("is selected");
	}
	else
	{
		System.out.println("not  selected");
		
		box.click();
	}
	
}
}
