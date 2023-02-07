package Practice__romm;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class random_ {
	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();
		int n=r.nextInt(1000);
		String username="aman";
		username=username+n;

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB.ENTER);
		d.findElement(By.id("container_tasks")).click();
		d.findElement(By.className("addNewButton")).click();
		d.findElement(By.className("createNewCustomer")).click();				
		d.findElement(By.className("newNameField")).sendKeys(username);
		d.findElement(By.cssSelector("[placeholder=\"Enter Customer Description\"]")).sendKeys("the mad man");
		d.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(1000);
		String actname=d.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actname);
		if(username.equals(actname)) 
		{
			System.out.println("tc is pass");
		
		}
		else
			System.out.println("tc is fail :");
		
		d.close();
	}
}
