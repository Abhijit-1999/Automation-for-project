package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonclock1 {

	
	WebDriver driver;
	Actions act;
	public static void main(String[] args) throws InterruptedException
	{
		Amazonclock1 a=new Amazonclock1();
		a.login();
		a.search();
		a.flower();
		a.data();
		//a.cs();
	}
	public void login() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void search() throws InterruptedException 
	{
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	    act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(search,"clock").perform();
		act.keyUp(Keys.SHIFT).perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		act.keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.DELETE).perform();
		act.keyUp(Keys.DELETE).perform();
				
	}
	public void flower() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement fl=driver.findElement(By.id("twotabsearchtextbox"));
		act.keyUp(Keys.SHIFT).sendKeys(fl,"flower",Keys.ENTER).perform();
	}
	public void data() throws InterruptedException
	{
		Thread.sleep(2000);
		String data=driver.findElement(By.xpath("//div[contains(@class,'sg-row-align-items-center sg-row')]/div/div/div/span[1]")).getText();
		System.out.println(data);
	}
	public void cs()
	{
		driver.close();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	

