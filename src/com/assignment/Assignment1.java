package com.assignment;


import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1{

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.yaantra.com/");
	
	Thread.sleep(2000);
	d.get("https://www.ebay.com/");
	
	Thread.sleep(2000);
	d.navigate().back();
	
	Thread.sleep(3000);
	String title=d.getTitle();
	System.out.println(title);
	
	d.manage().window().minimize();
	
	d.close();

	}

}
