package Practice__romm;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
			WebDriver d=new ChromeDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.get("https://www.flipkart.com/");
			d.findElement(By.xpath("//button[text()='✕']")).click();
			d.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
			Thread.sleep(2000);
			d.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).click();
			
			String main=d.getWindowHandle();
			Set<String> allwin=d.getWindowHandles();
			for(String win:allwin)
			{
				if(!(main.equals(allwin)))
				{
					d.switchTo().window(win);
				}
			}
	
	
	
	}
}
