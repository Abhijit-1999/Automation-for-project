package com.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DatafromEcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\Excel\\testdata.xlsx");
		/*
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row row=sh.getRow(0);
		Cell cell=row.getCell(1);
		String value1=cell.getStringCellValue();
		double value2=cell.getNumericCellValue();
		System.out.println(value1);
		System.out.println(value2);
		*/
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter format=new DataFormatter();
	String value1=	format.formatCellValue(sh.getRow(0).getCell(1));
		String value=format.formatCellValue(sh.getRow(1).getCell(0));
		System.out.println(value1);
		System.out.println(value);
		
	}
}
