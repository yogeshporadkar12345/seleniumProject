package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main (String[]args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		driver.manage().window().maximize();
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d = new File ("C:/Users/Yogesh/Desktop/pqr1.bmp");
		
		FileUtils.copyFile(s, d);
		
		
	

}
}