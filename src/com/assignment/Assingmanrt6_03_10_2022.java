package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingmanrt6_03_10_2022 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
		
		/*
		Thread.sleep(3000);	
		d.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
		//d.findElement(By.className("_2KpZ6l")).click();
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[type='text']")).sendKeys("i phone");
		
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[width='20']")).click();
		
		Thread.sleep(2000);
		String title=d.getTitle();
		System.out.println(title);
		
		*/
		
		d.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		
		
		d.findElement(By.name("q")).sendKeys("i phone");
		
		d.findElement(By.className("L0Z3Pu")).click();
		
		
		
		
	//	d.close();
	}
}
