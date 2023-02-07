package Practice__romm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filefromword {
	public static void main(String[] args) throws IOException {
		
		
		filefromword ffw=new filefromword();
		//ffw.m2();
//		ffw.m3();
//		ffw.m4();
//		ffw.m5();
		ffw.m6();
	}
	
	void m1() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\note\\amazon.properties");
		Properties pf=new Properties();
		pf.load(fis);
		String url=pf.getProperty("url");
		//System.out.println(url);
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	}
	void m2() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Excel\\flipkart.xlsx");
		/*
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.createSheet();
		Row row=sh.getRow(0);
		Cell cel=row.getCell(1);
	String value=cel.getStringCellValue();
	System.out.println(value);
*/
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	DataFormatter format=new DataFormatter();
	String value=format.formatCellValue(sh.getRow(0).getCell(1));
	//System.out.println(value);
	
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(value);
	
	
	}
	void m3() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Excel\\flipkart.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		int lastrow=sh.getLastRowNum();
		double lastcell=sh.getRow(0).getLastCellNum();
		
		
		System.out.println(lastrow);
		System.out.println(lastcell);
	}
	void m4() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Excel\\flipkart.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter format=new DataFormatter();
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			Row row=sh.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				String value=format.formatCellValue(row.getCell(j));
				System.out.println(value+" ");
			}
			System.out.println();
		}
		
	}
	void m5() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Excel\\setvalue.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(0).createCell(0).setCellValue("admin");
		FileOutputStream fos=new FileOutputStream("D:\\Excel\\setvalue.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("sending data sucessfull ");
	}
	
	void m6() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Scr/filpkart1.png");
		FileUtils.copyFile(src, trg);
		
	}
	
}






















