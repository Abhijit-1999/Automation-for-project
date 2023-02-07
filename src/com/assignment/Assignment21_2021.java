package com.assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment21_2021 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	d.get("https://www.irctc.com/");
	WebElement wa=d.findElement(By.xpath("//nav[contains(@class,'top_nav_links')]/div/ul/li[1]/a"));
    Actions a=new Actions(d);
    a.contextClick(wa).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
//	WebElement wb=d.findElement(By.xpath("//nav[contains(@class,'top_nav_links')]/div/ul/li[1]/a"));
//	a.contextClick().build().perform();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
	
}

}
