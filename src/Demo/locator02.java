package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator02 {

	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    Thread.sleep(3000);
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("email")).sendKeys("8446492019");
	    
	    driver.findElement(By.id("pass")).sendKeys("yogesh122");
	    
	    driver.findElement(By.tagName("button")).click();
	    
	 
	    
	 
}
}