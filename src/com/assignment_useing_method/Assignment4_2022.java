package com.assignment_useing_method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_2022 {
ChromeDriver d;
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		Assignment4_2022 c=new Assignment4_2022();
		c.launchBrowser();
		
		
		Thread.sleep(2000);
		c.Search();
		
		
		Thread.sleep(2000);
		String Get=c.fatch();
		System.out.println(Get);
		
		
		c.close();

		
	}
	
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		//d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
	}
	public void Search() throws InterruptedException
	{
		//Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='✕']")).click();
		d.findElement(By.name("q")).sendKeys("iphone 14");
		d.findElement(By.cssSelector("[type='submit']")).click();	
	}
	public String fatch()
	{
		String Fatch=d.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Purple, 128 GB)']/../../div[2]/div[1]/div[1]")).getText();
		return Fatch;
	}
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		d.close();
	}


}
