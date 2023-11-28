package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelpath, String sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
	     Workbook wb = WorkbookFactory.create(fis);
	     Sheet sheet = wb.getSheet(sheetname);
	     Row row = sheet.getRow(rowNo);
	     Cell cell = row.getCell(cellNo);
	     String data = cell.getStringCellValue();
	     return data;
	}
	public void writeExcelDta(String excelpath, String sheetname, int rowNo, int cellNo, String data) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis  = new FileInputStream(excelpath);//provide path excelfile
	             Workbook wb = WorkbookFactory.create(fis);//make the file to ready to read
	              Sheet sheet = wb.getSheet(sheetname);//get into the sheet
	                 Row row = sheet.getRow(rowNo);
	             Cell cell = row.createCell(cellNo);
	              cell.setCellValue(data);	
	              
	            FileOutputStream fos = new FileOutputStream(excelpath);//provide path excel file
	            wb.write(fos);//write data into excelfile
}

     public int rowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException {
    	 
  
     FileInputStream fis  = new FileInputStream(excelpath);////provide path excelfile
     Workbook wb = WorkbookFactory.create(fis);//make the file to ready to read
      Sheet sheet = wb.getSheet(sheetname);//get into the sheet
         int rc = sheet.getLastRowNum();//get no of row present in the sheet
         return rc;

		
	}

	
	}

	
	


