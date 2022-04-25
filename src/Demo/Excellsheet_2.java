package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellsheet_2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream excel=new FileInputStream("C:/Users/Yogesh/Desktop/abc.xlsx");
		Sheet a=WorkbookFactory.create(excel).getSheet("Sheet1");

		int rowno=a.getPhysicalNumberOfRows();//5
		//System.out.println(rowno);//4

		for(int i=0;i<rowno;i++) {//0 1 2 3 4

		int cellno=a.getRow(i).getPhysicalNumberOfCells();//3
		//System.out.println(cellno);

		for(int j=0;j<cellno;j++) {//0 1 2
		String ss=a.getRow(i).getCell(j).getStringCellValue();//(1,0)
		System.out.print(" " +ss);
		}
		System.out.println();


		}
		
	}}
		



