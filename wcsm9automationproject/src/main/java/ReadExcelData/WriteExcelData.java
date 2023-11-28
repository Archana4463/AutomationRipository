package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/main/resources/testData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("IPL");
	Row row = sheet.createRow(12);
	Cell cell = row.createCell(0);
	
	//set the string value
	cell.setCellValue("pune");
	
	//store value into the sheet
	FileOutputStream fos = new FileOutputStream("./src/main/resources/testData.xlsx");
	
	//write the data
	wb.write(fos);
	
		
		
		
		
		
	}
	}


