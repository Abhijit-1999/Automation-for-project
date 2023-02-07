package com.assignment_useing_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_2022 {
	ChromeDriver d;
	
	
	public static void main(String[] args) throws InterruptedException {
		Assignment3_2022 a=new Assignment3_2022();
		a.gotoEbay();
		
	}
	public void gotoEbay() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://www.ebay.com/");
		
	}

	public void Srearch()
	{
		
	}
}
