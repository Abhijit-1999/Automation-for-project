package com.assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment20_ {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.orangehrm.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[contains(@class,'web-menu-btn')]//ul//li[2]//a")).click();
		
		d.findElement(By.name("FullName")).sendKeys("Abhijit Prusty",Keys.TAB,Keys.TAB,"7609091813",Keys.TAB,"ggabhijit56@gmail.com",Keys.TAB,"india",Keys.ENTER);
		d.findElement(By.name("NoOfEmployees")).sendKeys(Keys.RIGHT,"101-150",Keys.ENTER,Keys.TAB,"software test Engineer",Keys.ENTER,Keys.TAB,"i'm good in core java and automation testing in selenium webDriver also   thank u !",Keys.TAB,Keys.ENTER);
		
		
		
	}

}

