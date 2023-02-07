package Autoomation.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class GeneralSetting extends BaseClass{
	@Test
	void dropdown()
	{
		d.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings')]")).click();
		d.findElement(By.xpath("//ul[@id='popup_menu_items_content']/li[4]")).click();
		
		WebElement sl=d.findElement(By.id("firstHierarchyLevelCodeSelect"));
		
		CommonUtility cu=new CommonUtility();
		cu.getSelectByVisibleText(sl,"Product");
		
		WebElement visible=d.findElement(By.id("FormModifiedTextCell"));
		String print=visible.getText();
		System.out.println(print);
	}
}

