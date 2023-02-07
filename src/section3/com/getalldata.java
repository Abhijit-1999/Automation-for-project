package section3.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getalldata {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Excel\\getalldata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		
		DataFormatter format=new DataFormatter();
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
		Row	row=sh.getRow(i);
		
		for(int j=0;j<row.getLastCellNum();j++)
		{
			String value=format.formatCellValue(row.getCell(j));
			System.out.print(value+" ");
		}
		System.out.println();
		}
	}
}
