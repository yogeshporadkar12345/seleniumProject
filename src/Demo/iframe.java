package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	Thread.sleep(2000);
	
	driver.switchTo().frame(0);
	
	Thread.sleep(2000);

	driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
	



}
}