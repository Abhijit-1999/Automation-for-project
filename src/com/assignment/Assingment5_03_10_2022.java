package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment5_03_10_2022 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
	}

}
