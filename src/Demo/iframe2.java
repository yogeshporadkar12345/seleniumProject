package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	Thread.sleep(2000);
	
	driver.switchTo().frame(0);
	
	Thread.sleep(2000);

	driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
	
	Thread.sleep(2000);
	
	//driver.switchTo().defaultContent();
	
	driver.switchTo().parentFrame();        //*****
	
	driver.switchTo().frame(2);
	
	Thread.sleep(2000);

	driver.findElement(By.linkText("By.Remotable")).click();
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[4]")).click();
	
	
	

}
}
