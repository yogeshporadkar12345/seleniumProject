package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_driver {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Open the Excel sheet

		FileInputStream excel = new FileInputStream("C:/Users/Yogesh/Desktop/abc.xlsx");

		Sheet a= WorkbookFactory.create(excel).getSheet("Sheet2");

		long  b= (long)a.getRow(1).getCell(0).getNumericCellValue();
		String c= a.getRow(5).getCell(0).getStringCellValue();

		Thread.sleep(2000);

		driver.findElement(By.name("email")).sendKeys(""+b);
		driver.findElement(By.name("pass")).sendKeys(c);

		Thread.sleep(2000);

		driver.findElement(By.name("login")).click();


		}

		
}

