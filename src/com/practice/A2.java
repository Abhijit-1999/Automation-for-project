package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.ebay.com/");
		Thread.sleep(2000);
		d.findElement(By.id("gh-ac")).sendKeys("watch");
		d.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}

}

