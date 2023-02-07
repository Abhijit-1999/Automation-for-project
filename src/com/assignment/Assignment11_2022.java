package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11_2022 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement ser=d.findElement(By.name("q"));//.sendKeys("iphonex");
		ser.sendKeys("television");
		String value=ser.getAttribute("value");
		System.out.println(value);
		
	}

}
