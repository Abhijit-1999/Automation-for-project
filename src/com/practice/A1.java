package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		
		d.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
	//	d.findElement(By.)
		
		
	}

}
