package com.assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15_2022 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement Usernameloc=driver.findElement(By.id("username"));
	Usernameloc.sendKeys("admin");
	
	WebElement password=driver.findElement(By.name("pwd"));
	password.sendKeys("manager");
	
	WebElement login=driver.findElement(By.id("loginButton"));
	login.click();
	Thread.sleep(2000);
	WebElement are=driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']"));
	are.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
	
	Thread.sleep(2000);
	WebElement actitime=driver.findElement(By.className("pagetitle"));
	File src=actitime.getScreenshotAs(OutputType.FILE);
	File tag=new File("./Screenshot/actitime.png");
	FileUtils.copyFile(src,tag);










}
}
