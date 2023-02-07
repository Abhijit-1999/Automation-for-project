package com.assignment_useing_method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_02_2022 {
	ChromeDriver d;
	
	public static void main(String[] args) throws InterruptedException {
		
		Assignment_02_2022 a=new Assignment_02_2022();
		a.openBrowser();
		a.search();
		a.Close();
		
	}
	
	
	
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.google.com/");
	}
	public void search() throws InterruptedException
	{
		d.findElement(By.name("q")).sendKeys("sachin tendulkar");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@role='button']")).click();
		Thread.sleep(3000);
		String fatch=d.findElement(By.xpath("//div[@id='result-stats']")).getText();
		System.out.println(fatch);
	}
	public void Close()
	{
		d.close();
	}

	
}
