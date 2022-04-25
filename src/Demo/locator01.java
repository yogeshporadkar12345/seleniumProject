package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator01 {

	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
	    Thread.sleep(3000);
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.tagName("a")).click();    //click on gmail 
	    
	    

}
}
