package com.ust.datadriven.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class WritingInExcelDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("D:\\xls\\Sample.xls");
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		HSSFSheet sheet = workBook.getSheetAt(0);
		 Row row = sheet.getRow(0);
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row newRow = sheet.createRow(rowCount+1);
		 for(int j = 0; j < row.getLastCellNum(); j++){
			 
		       
		 
		        Cell cell = newRow.createCell(j);
		 
		        cell.setCellValue("Hi Testing"+j);
		 
		    }
		 
		 fi.close();
		 FileOutputStream outputStream = new FileOutputStream("D:\\xls\\Sample.xls");
		 
		    
		 
		 workBook.write(outputStream);
		 
		   workBook.close();
		 
		    outputStream.close();
		 System.out.println("Done....");
	}

}
