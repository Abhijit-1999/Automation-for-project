package com.section3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01_2022 {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	
	FileInputStream fis=new FileInputStream("D:\\selenium html note\\Naukri.properties");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("Url");
	//System.out.println(url);
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	
	d.get(url);
	d.findElement(By.cssSelector("[title='Jobseeker Register']")).click();
	JavascriptExecutor jse=(JavascriptExecutor)d;
	jse.executeScript("window.scrollBy(0,300);");
	d.findElement(By.xpath("//div[@class='radioWrap']/div[1]/div[2]/h2[1]")).click();
	
	//for upload resume by using Robot class
	d.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Thread.sleep(2000);
	StringSelection s=new StringSelection("D:\\note\\Abhijit Prusty.1.pdf");
	Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
	cb.setContents(s,null);
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	System.out.println(url);
	d.close();
	
	
	}
}




















