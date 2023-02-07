package section3.com;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	/*
	@Test
	public void username()
	{
		System.out.println("user created !..");
	}
	@Test
	void delete()
	{
		System.out.println("delete user ..");
	}
*/
	@Test
	void check()
	{
		System.out.println("customer creation ");
		Reporter.log("the clue");
	}
	@Test
	void m1()
	{
		System.out.println("second method is executing ");
		Reporter.log("the man who can deserve batter ",true);
	}



}
