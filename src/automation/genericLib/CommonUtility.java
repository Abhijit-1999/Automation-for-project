package automation.genericLib;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CommonUtility {
	Alert at;
	public int getRandomNumber(int n)
	{
		Random r=new Random();
		int num=r.nextInt(n);
		return num;
	}
	public String getAlertmsg(WebDriver d)
	{
		at=d.switchTo().alert();
		String msg=at.getText();
		return msg;
	}
	public void getCancel(WebDriver d)
	{
		at=d.switchTo().alert();
		at.dismiss();
		
	}
	public void getSelectByVisibleText(WebElement drop,String visible)
	{
		Select s=new Select(drop);
		s.selectByVisibleText(visible);
		
	}
}
