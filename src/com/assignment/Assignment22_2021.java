package com.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22_2021 {
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("Abhijit");
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
		Alert alt=driver.switchTo().alert();
		//fetch the msz
		String msg=alt.getText();
		System.out.println(msg);
		//cancel the msz
		alt.dismiss();
		WebElement schreen=driver.findElement(By.xpath("//table[@class='leftAligned']/tbody/tr[1]/td[1]"));
		File act=schreen.getScreenshotAs(OutputType.FILE);
		File bct=new File("./schreenshot1/schreen.png");
		FileUtils.copyFile(act,bct);
	}

}
