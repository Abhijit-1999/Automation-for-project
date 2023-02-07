package automation.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtilty {

	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\note\\actitime.properties");
		Properties ps=new Properties();
		ps.load(fis);
		String value=ps.getProperty(key);
		return value;
		
	}
	public String getDatafromExcelSheet(String sheetname,int rownum,int cellnum) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Excel\\getalldata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
		
	}
}
