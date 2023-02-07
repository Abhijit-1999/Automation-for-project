package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment25_2021 {

	
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	d.get("https://jqueryui.com/datepicker/");
	d.switchTo().frame(0);
	d.findElement(By.id("datepicker")).click();
	String month=d.findElement(By.className("ui-datepicker-month")).getText();
	String year=d.findElement(By.className("ui-datepicker-year")).getText();
	
	while(!(month.equals("November") && year.equals("1999")))
	{
		d.findElement(By.xpath("//span[text()='Prev']")).click();
		month=d.findElement(By.className("ui-datepicker-month")).getText();
		year=d.findElement(By.className("ui-datepicker-year")).getText();	
	}
	d.findElement(By.xpath("//a[text()='13']")).click();
}








//!(month.equals("November") && year.equals("1999"))

































}
