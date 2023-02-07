package section3.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestNG1 {
	@Test
	void m1()
	{
		String name="Chintu",expname="chintu";
		Assert.assertEquals(name,expname);
		System.out.println("check it is working or not ");
	}
	@Test
	void m2()
	{
		String name1="Chintu",name2="chintu";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(name1,name2);
		sa.assertAll();
		System.out.println(" check it is working or not ");
	}
}
