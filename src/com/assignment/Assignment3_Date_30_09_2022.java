package com.assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Date_30_09_2022 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		
		
		/*
		Thread.sleep(2000);
		By UsernameLoc=By.id("username");
		WebElement username=d.findElement(UsernameLoc);
		username.sendKeys("admin");
		*/
		Thread.sleep(2000);
		d.findElement(By.id("username")).sendKeys("admin");
		
		
		/*
		Thread.sleep(2000);
		By passwordLoc=By.name("pwd");
		WebElement password=d.findElement(passwordLoc);
		password.sendKeys("manager");
		*/
		Thread.sleep(2000);
		d.findElement(By.name("pwd")).sendKeys("manager");
		
		/*
		Thread.sleep(2000);
		By Checkboxloc=By.name("remember");
		WebElement checkbox=d.findElement(Checkboxloc);
		checkbox.click();
		*/
		
		Thread.sleep(2000);
		d.findElement(By.name("remember")).click();
		
		
		
		Thread.sleep(3000);
		By Loginloc=By.id("loginButton");
		WebElement log=d.findElement(Loginloc);
		log.click();
		
		/*
		Thread.sleep(2000);
		d.findElement(By.id("loginButton")).click();
		*/
		Thread.sleep(2000);
		String title=d.getTitle();
		System.out.println(title);
		
		
		d.close();
	}

}
