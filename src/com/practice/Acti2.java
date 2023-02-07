package com.practice;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acti2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement google=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.keyDown(Keys.SHIFT).sendKeys(google,"selenium").perform();
		a.keyUp(Keys.SHIFT).sendKeys(google,"selenium").perform();
	
	
	
	

	}
}
