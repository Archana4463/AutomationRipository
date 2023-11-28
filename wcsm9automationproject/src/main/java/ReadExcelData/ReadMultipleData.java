package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//read multiple data from test data
		
		for(int i=1;i<=10;i++)
		{
		FileInputStream fis = new FileInputStream("./src/main/resources/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(i);
	    Cell cell = row.getCell(1);
	    
	   String data   = cell.getStringCellValue();
	   Thread.sleep(2000);
	   System.out.println(data);
		
	}

	
	}


}