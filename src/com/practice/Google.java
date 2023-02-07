package com.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement flip=driver.findElement(By.xpath("//img[@title='Flipkart']/../../.."));
	File src=flip.getScreenshotAs(OutputType.FILE);
	File trg=new File("./Screenshot/flipkart.png");
	FileUtils.copyFile(src,trg);
	
}
}
