package com.assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment7_06_10_2022 {
	public static void main(String[] args) 
	{
		Random r=new Random();
		int n=r.nextInt(10000);
		String Username="Bismita";
		Username=Username+n;
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver d=new ChromeDriver();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//d.manage().window().maximize();
				d.get("https://demo.actitime.com/login.do");
				
				//log in action
				d.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB.ENTER);
				
				//click on task ..
				d.findElement(By.id("container_tasks")).click();
				d.findElement(By.className("addNewButton")).click();
				d.findElement(By.className("createNewCustomer")).click();				
				d.findElement(By.className("inputNameField")).sendKeys(Username);
				d.findElement(By.cssSelector("[placeholder=\"Enter Customer Description\"]")).sendKeys("the mad man");
				d.findElement(By.xpath("//div[text()='Create Customer']")).click();
				
				String ActUsername=d.findElement(By.className("titleEditButtonContainer")).getText();
				System.out.println(ActUsername);
				
				if(Username.equals(ActUsername))
				{
					System.out.println("name is matching");
				}
				else
					System.out.println("Username is not matcing");
				
				d.close();			
	}			
}
