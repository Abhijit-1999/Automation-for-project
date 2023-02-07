package com.assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23_2021 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement(By.xpath("(//*[name()='svg' and @class='oxd-icon orangehrm-sm-icon'])[1]")).click();
		String ha=driver.getWindowHandle();
		Set<String> ha2=driver.getWindowHandles();
		for(String a:ha2) 
		{
			if(!(a.equals(ha)))
			{
				driver.switchTo().window(a);
			}
		}
	String main=	driver.getWindowHandle();
	driver.switchTo().window(ha);
	driver.findElement(By.xpath("(//*[name()='svg' and @class='oxd-icon orangehrm-sm-icon'])[2]")).click();
	
	String hat=driver.getWindowHandle();
	Set<String> hat2=driver.getWindowHandles();
	for(String a2:hat2)
	{
		if(!(a2.equals(hat2)))
		{
			driver.switchTo().window(hat);
		}
	}
		String main2=driver.getWindowHandle();
		driver.switchTo().window(hat);
		driver.findElement(By.xpath("(//*[name()='svg' and @class='oxd-icon orangehrm-sm-icon'])[4]")).click();
		
	}

	
	
	
	
	
	
}
