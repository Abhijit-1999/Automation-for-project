package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_30_09_2022 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver D=new ChromeDriver();
		
		Thread.sleep(2000);
		D.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(3000);
		D.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		D.findElement(By.name("password")).sendKeys("admin123");
		
		
		Thread.sleep(3000);
		D.findElement(By.className("orangehrm-login-footer")).click();
		
	}

}
;