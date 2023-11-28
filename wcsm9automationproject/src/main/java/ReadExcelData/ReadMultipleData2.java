package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//provide the path of excel file
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		
		//to make a file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("IPL");//To get into perticular sheet
		int rc = sheet.getLastRowNum();//To get  no.of rows.
		
		
		for(int i=1; i<=rc; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
			
			
		
		
			
			
		}

		
		
	}
	}

