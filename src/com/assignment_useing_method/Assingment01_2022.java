package com.assignment_useing_method;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment01_2022 {
	
	ChromeDriver d;
	
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.manage().window().maximize();
		//d=new ChromeDriver();		
		
	}
	
		public void login() throws InterruptedException
		{
			Thread.sleep(2000);
			d.findElement(By.id("username")).sendKeys("admin");
			d.findElement(By.name("pwd")).sendKeys("manager");
			d.findElement(By.className("initial")).click();
			
		}
		public String customerCreation(String Username) throws InterruptedException
		{
			d.findElement(By.id("container_tasks")).click();
			
			Thread.sleep(2000);
			d.findElement(By.className("addNewButton")).click();
			d.findElement(By.className("createNewCustomer")).click();
			Thread.sleep(2000);
			d.findElement(By.className("inputNameField")).sendKeys(Username);
			d.findElement(By.cssSelector("[placeholder=\"Enter Customer Description\"]")).sendKeys("the mad man");
			
			d.findElement(By.xpath("//div[text()='Create Customer']")).click();
			Thread.sleep(2000);
			String ActUsername=d.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
			System.out.println(ActUsername);
			
			return Username;
		
		}
		public void Close()
		{
			d.close();
		}
		public static void main(String[] args) throws InterruptedException {
			
			Random r=new Random();
			int num=r.nextInt();
			String Username="abhijit";
			Username=Username+num;
			Assingment01_2022	a=new Assingment01_2022();
		 	
			
			a.launchbrowser();
		 	a.login();
		 	Thread.sleep(2000);
		 	String name=a.customerCreation(Username);
		 	if(Username.equals(name))
		 	{
		 		System.out.println("Username is matching");
		 	}
		 	else
		 	{
		 		System.out.println("Usrename is not matching");
		 	}
		 	a.Close();
		 		
		 	
		}
		
	

}
