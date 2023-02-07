package section3.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class valuegivetoexcelSheet {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Excel\\givevalue.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(0).createCell(1).setCellValue("abhijit");
		FileOutputStream fos=new FileOutputStream("D:\\Excel\\givevalue.xlsx");
		book.write(fos);
		fos.flush();
		
		System.out.println("value input successfull :");
		
	}
}
