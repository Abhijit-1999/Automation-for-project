package section3.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataformExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Excel\\testdata.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter format=new DataFormatter();
		String value1=	format.formatCellValue(sh.getRow(0).getCell(1));
		String value=format.formatCellValue(sh.getRow(1).getCell(0));
		System.out.println(value1);
		System.out.println(value);
		
	}
}
