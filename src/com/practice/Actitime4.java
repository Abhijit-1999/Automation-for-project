package com.practice;


	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Actitime4
	{
		WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException
	{
		Actitime4 ac1=new Actitime4();
		ac1.Login();
		
		ac1.LunchBrowser();
		
		ac1.Setting();
	}
	public void Login()throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
	}
	public void LunchBrowser() throws InterruptedException
	{
	driver.findElement(By.id("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	
	}
	public void Setting() throws InterruptedException, IOException {
		
	driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
	Thread.sleep(2000);
	WebElement ac=driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/../div[1]"));
	ac.click();
	File src=ac.getScreenshotAs(OutputType.FILE);
	File trg=new File("./SchreenShot2/actitime.png");
	FileUtils.copyFile(src, trg);
	}

}
