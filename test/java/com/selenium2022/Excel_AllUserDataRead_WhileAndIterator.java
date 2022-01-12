package com.selenium2022;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_AllUserDataRead_WhileAndIterator {
	
	@Test
	public void allUserDataRead() throws IOException {
	
	File src = new File("/Users/jannatulnayeem/Desktop/excel/UserData.xlsx");	// File location
	FileInputStream fis = new FileInputStream(src);		// Excel File Input from src
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);			// file Load to workbook
	DataFormatter df = new DataFormatter();				// Formatter use to read diff.types of data
//	XSSFSheet sh = wb.getSheet("Sheet 1");				// Sheet Get/load from work book > String
	XSSFSheet sh = wb.getSheetAt(0);					// Sheet Get/load from work book > by index

// Read All Excel data by iterator > When data is stored in a dynamic table [ we don't know the range]
	Iterator<Row> rowIterate = sh.rowIterator();		// This is reading the row from sheet
	while (rowIterate.hasNext()) {						// This is condition
		Row row = rowIterate.next();					// Start reading the row 
		
		Iterator<Cell> cellIterate = row.cellIterator(); // Cell read from individual Row
		while (cellIterate.hasNext()) {					 // This is condition
			Cell cell = cellIterate.next();				 // Start reading the cell value
		
			String Cellvalue = df.formatCellValue(cell);
			System.out.print(Cellvalue+" \t");
		
		//	System.out.println(df.formatCellValue(cellIterate.next())); // ShortWay>> after >> while (cellIterate.hasNext()){
			
			}
		System.out.println();
		wb.close();
		
		}
	
	}
}
