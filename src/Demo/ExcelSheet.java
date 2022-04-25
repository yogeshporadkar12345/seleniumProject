package Demo;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	
		FileInputStream excel = new FileInputStream("C:/Users/Yogesh/Desktop/abc.xlsx");
		
	       Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
	       
	       
			String b= a.getRow(0).getCell(0).getStringCellValue();
			String c=a.getRow(1).getCell(0).getStringCellValue();
			String d=a.getRow(2).getCell(0).getStringCellValue();
			
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
		}

	}


