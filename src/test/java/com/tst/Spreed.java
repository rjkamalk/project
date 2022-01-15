package com.tst;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Spreed {
//public static void SendByExcel() throws IOException {
//	    File f = new File("F:\\newprograms\\test\\data\\Datafile.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//		Workbook wb = new XSSFWorkbook(fis);
//		Sheet sheet = wb.getSheet("Sheet1");
//		Row row = sheet.getRow(3);
//		Cell cell = row.getCell(1);
//		System.out.println(cell);
	 public void ram() {
		 System.out.println("completed");
		 
	 
	}
	
	public static void main(String[]arg) throws IOException {
//		SendByExcel();
		 Spreed fr =new Spreed();
		fr.ram();
	}
}
