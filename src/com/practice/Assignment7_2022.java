package com.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment7_2022 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("container_tasks")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[class='title ellipsis']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[class='item createNewCustomer']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Ruby");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("I am studying in QSpiders");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
			Thread.sleep(2000);
			String t=driver.findElement(By.cssSelector("[title='Ruby']")).getText();
			System.out.println(t);
			driver.close();
		
		}

	
}
