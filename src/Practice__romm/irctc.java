package Practice__romm;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class irctc {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.irctc.com/");
		WebElement wa=d.findElement(By.className("open_mobile_menu"));
	   wa.click();
	   d.findElement(By.xpath("//a[text()='About Us']/../span[1]")).click();
	   d.findElement(By.xpath("//div[@class='main_nav_mobile_inner']/div/ul/li[1]/ul/li[2]/a")).click();
	
	
	
	}
}
