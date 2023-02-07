package com.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmnet18_2021 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://timeanddate.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Current Time']/../../..//div[2]//div//form//input")).sendKeys("bang");
		
		List<WebElement> all=driver.findElements(By.xpath("//span[contains(text(),'Indonesia')]/../../../../.."));
		for(WebElement eb:all)
		{
			System.out.println(eb.getText());
		}
	}

}
