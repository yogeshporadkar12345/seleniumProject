package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FILE_UPLOAD {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");

		WebDriver driver=new ChromeDriver();


		driver.get("http://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:/Users/Yogesh/Desktop/software testing/Automation testing/selilium/1.Automation Introduction.docx");


		//WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field

		//uploadElement.sendKeys("E://Class Docs//Software Testing//Java//All Java Programs//ARMSTRONG_NUMBER.txt");


		// check the "I accept the terms of service" check box

		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button

		driver.findElement(By.name("send")).click();

		}


}
