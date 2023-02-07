package Autoomation.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class Alertpopup extends BaseClass{
	@Test
	void alertHandling()
	{
		d.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings')]")).click();
		d.findElement(By.linkText("Types of Work")).click();
		d.findElement(By.className("i")).click();
		d.findElement(By.id("name")).sendKeys("coooooolllllll..........");
		d.findElement(By.xpath("//td[contains(@id,'ButtonPane')]/input[2]")).click();
		
		
		// for print the massage
		CommonUtility cu=new CommonUtility();
		String sms=cu.getAlertmsg(d);
		System.out.println(sms);
		
		// for cancel the  popup
		cu.getCancel(d);
	}
}
