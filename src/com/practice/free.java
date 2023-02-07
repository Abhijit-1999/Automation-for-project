package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class free 
{
	ChromeDriver d;
	public static void main(String[] args) 
	{
		free f=new free();
		f.launch();
		f.search();
		f.fetch();
	}
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
	}
	public void search()
	{
		d.findElement(By.xpath("//button[text()='✕']")).click();
		d.findElement(By.name("q")).sendKeys("vivo");
		d.findElement(By.cssSelector("[type='submit']")).click();	
	
	}
	public void fetch()
	{
		String title=d.findElement(By.xpath("//div[text()='vivo T1 5G (Rainbow Fantasy, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(title);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
