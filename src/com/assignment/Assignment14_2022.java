package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14_2022 {

WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		Assignment14_2022 d=new Assignment14_2022();
		d.launch();
		d.open();
		d.click();
		d.fetch();
	}
	public void launch() throws InterruptedException
	{
		Thread.sleep(200);
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
	}
	public void open()
	{
		WebElement Usernameloc=driver.findElement(By.id("username"));
		Usernameloc.sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		
	}
	public void click() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement are=driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']"));
		are.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//td[@rowspan='2']/../td[1]/span[1]")).getText();
	}
	public void fetch() throws InterruptedException
	{
		
		driver.findElement(By.className("i")).click();

		Thread.sleep(2000);
		String fatch=driver.findElement(By.xpath("//td[contains(text(),'Type of Work')]")).getText();
		System.out.println(fatch);
	}
	
}
