package com.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment17_2021 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement wb=d.findElement(By.name("q"));
		wb.sendKeys("nokia");
		
		List<WebElement> allnokia=d.findElements(By.xpath("//li//div[contains(@data-tkid,'mobile phone 2022')]/../.."));
		for(WebElement ev:allnokia)
		{
			System.out.println(ev.getText());
		}
	}

}
