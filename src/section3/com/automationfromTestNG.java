package section3.com;

import org.testng.annotations.Test;

public class automationfromTestNG {
	@Test(dependsOnMethods="deletuser")
	public void execute()
	{
		System.out.println("user created !!!..");
	}
	@Test(priority=0)
	public void deletuser()
	{
		System.out.println("user deleted ...");
	}
	
}
