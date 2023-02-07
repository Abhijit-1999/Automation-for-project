package com.assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.amazon.com/");
			d.manage().window().maximize();
			Thread.sleep(2000);
			d.manage().window().setPosition(new Point(200,500));
			Thread.sleep(2000);
			d.manage().window().setSize(new Dimension(211,600));
			Thread.sleep(3000);
			d.close();
		}
}
