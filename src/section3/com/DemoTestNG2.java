package section3.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestNG2 {
//	@Test
//	void m1()
//	{
//		String name="chintu";
//		String name2="chin";
//		Assert.assertTrue(name.contains(name2));
//		System.out.println("it is matching ");
//	}
	
	@Test 
	void main()
	{
		String text="cooool",text2="cooo";
		Assert.assertTrue(text.contains(text2));
		System.out.println("its matching ");
	}
	@Test
	public void m1()
	{
		String name="chuma",name2="Chuma";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(name,name2);
		System.out.println("it is pass  ");
	}
	@Test
	void the()
	{
		String in="indu",in2="anku";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(in.contains(in2));
		System.out.println("ot ");
		sa.assertAll();
	}
	@Test
	void m3()
	{
		String actual="chintu",expect="Cintu";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual,expect);
		System.out.println("the ");
		sa.assertAll();
	}
}
