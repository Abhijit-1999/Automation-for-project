package com.assignment_useing_method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment05_2022 
{
	ChromeDriver d;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		//d.manage().window().maximize();
		d.get("https://www.worldometers.info/coronavirus/");
	}
	public String coronaviruscase()
	{
		String viruscase=d.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div[1]")).getText();
		return viruscase;
	}
	public String death() throws InterruptedException
	{
		Thread.sleep(2000);
		String Death=d.findElement(By.xpath("//h1[text()='Deaths:']/../div[1]")).getText();
		return Death;
	}
	
	public String recover() throws InterruptedException
	{
		Thread.sleep(2000);
		String recov=d.findElement(By.xpath("//h1[text()='Recovered:']/../div[1]")).getText();
		return recov;
	}
	public void close()
	{
		d.close();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Assignment05_2022 ac=new Assignment05_2022();
		ac.launchBrowser();
		String CoronaVirus=ac.coronaviruscase();
		System.out.println("corona virus casess "+CoronaVirus);
		
		Thread.sleep(2000);
		String Death=ac.death();
		System.out.println("Death casess "+Death);
		
		String Recover=ac.recover();
		System.out.println("Recover casess "+Recover);
		
		ac.close();
	}
	
	
	
	
	
	
	
	
	
	
}
