package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);	
		d.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
		//d.findElement(By.className("_2KpZ6l")).click();
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[type='text']")).sendKeys("i phone");
		
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[width='20']")).click();
		
		Thread.sleep(2000);
		String title=d.getTitle();
		System.out.println(title);
		
		d.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Thread.sleep(2000);
		d.findElement(By.name("email")).sendKeys("7609091811");
		d.findElement(By.name("pass")).sendKeys("Abhijit");
		d.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		d.findElement(By.linkText("Forgotten password?")).click();
		
		
		Thread.sleep(2000);
		d.findElement(By.name("email")).sendKeys("7609091212");
		
		
		Thread.sleep(3000);
		d.findElement(By.name("pass")).sendKeys("Abhijit");
		
		Thread.sleep(2000);
		d.findElement(By.name("login")).click();
		*/
	}
}
