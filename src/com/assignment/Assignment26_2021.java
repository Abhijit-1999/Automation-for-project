package com.assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment26_2021 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.naukri.com/");
		WebElement job=d.findElement(By.xpath("//div[text()='Jobs']"));
		Actions a=new Actions(d);
		a.moveToElement(job).perform();
		
		d.findElement(By.xpath("//a[@title='IT jobs']")).click();
		d.findElement(By.xpath("//a[text()='Embedded Test Engineer']")).click();
		String main=d.getWindowHandle();
		Set<String> m2=d.getWindowHandles();
		for(String all:m2)
		{
			if(!(main.equals(all)))
			{
				d.switchTo().window(all);
			}
		}
		//d.switchTo().window(main);
		Thread.sleep(5000);
		JavascriptExecutor je=(JavascriptExecutor)d;
		je.executeScript("window.scrollBy(0,7000);");

		
		
		WebElement ss=d.findElement(By.xpath("//a[text()='Connect with us']/.."));
		File src=ss.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/naukri.png");
		FileUtils.copyFile(src,trg);
	
		d.findElement(By.xpath("//a[text()='Privacy policy']")).click();
		String title=	d.getTitle();
		System.out.println(title);
	
	
	
	
	}
}
