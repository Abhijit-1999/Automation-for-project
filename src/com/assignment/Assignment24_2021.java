package com.assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment24_2021 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		WebElement frame1=d.findElement(By.name("iframe_a"));
		d.switchTo().frame(frame1);
		d.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		
//		Alert at=d.switchTo().alert();
//		at.accept();
//		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,400);");
		String mainid=d.getWindowHandle();
		Set<String>secondid=d.getWindowHandles();
		for(String id:secondid) 
		{
			if(!(id.equals(mainid)))
			{
			d.switchTo().window(id);	
			}
		}
		d.findElement(By.xpath("//ul[contains(@class,'hide-in-mobile')]/li[4]/a[1]")).click();
		d.findElement(By.linkText("RRB NTPC Stage 1")).click();
		System.out.println(d.getTitle());
		

		
		
	
		
		
	}
}
