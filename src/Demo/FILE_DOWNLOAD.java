package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FILE_DOWNLOAD {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");

		WebDriver driver=new ChromeDriver();


		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=93.0.4577.63/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.linkText("chromedriver_win32.zip")).click();


		}

		}




