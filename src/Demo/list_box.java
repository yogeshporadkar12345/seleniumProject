package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
	  WebElement lbox = driver.findElement(By.id("multiselect"));
	  
	  Select s = new Select(lbox);
	  
	  s.selectByIndex(3);    //select by index
	  Thread.sleep(3000);
	
	  Thread.sleep(3000);
	  
	  s.selectByValue("hyundai");  // select by value
	  Thread.sleep(3000);
	 
	  Thread.sleep(3000);
	  
	  s.selectByVisibleText("Honda");  // select by visible text
	  Thread.sleep(3000);
	
	  s.deselectAll();

}
}	
