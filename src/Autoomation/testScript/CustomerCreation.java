package Autoomation.testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;
import automation.genericLib.DataUtilty;

public class CustomerCreation extends BaseClass{
	@Test
	public  void createCustomer() throws IOException 
	{
		DataUtilty du=new DataUtilty();
		CommonUtility cu=new CommonUtility();
		int num=cu.getRandomNumber(1000);
		String expcustomername=du.getDatafromExcelSheet("Sheet2",0,0);
		expcustomername=expcustomername+num;
		d.findElement(By.id("container_tasks")).click();
		d.findElement(By.className("addNewButton")).click();
		d.findElement(By.className("createNewCustomer")).click();				
		d.findElement(By.className("newNameField")).sendKeys(expcustomername);
		d.findElement(By.cssSelector("[placeholder=\"Enter Customer Description\"]")).sendKeys("the mad man");
		d.findElement(By.xpath("//div[text()='Create Customer']")).click();
	
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"),expcustomername));
		String name=d.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(name);
	}
	
	
}
