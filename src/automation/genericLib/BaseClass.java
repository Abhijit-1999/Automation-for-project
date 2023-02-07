package automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver d;
	public DataUtilty du=new DataUtilty();
	@BeforeClass
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();	
	}
	@BeforeMethod
	public void login() throws IOException
	{
		d.get(du.getDataFromProperties("url"));
		d.findElement(By.id("username")).sendKeys(du.getDataFromProperties("Username"));
		d.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("Password"));
		d.findElement(By.id("loginButtonContainer")).click();
	}
	@AfterMethod
	public void logout()
	{
		d.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		d.close();
	}
}
