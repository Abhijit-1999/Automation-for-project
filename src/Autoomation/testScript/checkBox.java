package Autoomation.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;

public class checkBox extends BaseClass{
	@Test
	void check()
	{
		d.findElement(By.id("container_tasks")).click();
		d.findElement(By.xpath("//table[(@class='headerRowTable')]//tr[1]/td[1]/div/div")).click();
		d.findElement(By.className("delete button")).click();
		
	}
}
