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

public class WriteTeatData2 {


		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./src/main/resources/testData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("IPL");
			
			//create new row into Excel sheet
			Row row = sheet.createRow(0);
			
			//create new cell
			Cell cell = row.createCell(2);
			
			//set the string value in cell
			cell.setCellValue("location");
			
			//store value into the sheet
			FileOutputStream fos = new FileOutputStream("./src/main/resources/testData.xlsx");
			
			//write the data
			wb.write(fos);
			
	}

}
