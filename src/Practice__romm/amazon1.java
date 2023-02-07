package Practice__romm;

import java.time.Duration;

import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Timeouts;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
	
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	
	d.manage().window().maximize();
	
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	d.manage().window().minimize();
	
	String s=d.getCurrentUrl();
	System.out.println(s);
	
	String s2=d.getTitle();
	System.out.println(s2);
	
	d.manage().window().setPosition(new Point(200,563));
	d.close();
	
	
	
	}
	

}
