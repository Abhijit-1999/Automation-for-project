package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_10_22 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search=d.findElement(By.name("q"));
		search.sendKeys("iphonex");
		search.submit();
		
		
	}

}
