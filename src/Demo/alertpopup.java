package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	
	driver.get("http://demo.guru99.com/test/delete_customer.php ");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);

	driver.findElement(By.name("cusid")).sendKeys("53920");

	Thread.sleep(2000);

	driver.findElement(By.name("submit")).click();

	Thread.sleep(2000);


	//driver.switchTo().alert().accept();                     //for click on OK button
	
	//Thread.sleep(2000);
	
	//driver.switchTo().alert().accept();

	driver.switchTo().alert().dismiss();                 //for click on cancel button

	//Thread.sleep(2000);

	//driver.switchTo().alert().accept();

	//String abc = driver.switchTo().alert().getText();
	//System.out.println(abc);


	}

	


}
