package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions_of_webelement {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.co.in/");
		
		driver.get("http://demo.guru99.com/test/radio.html ");      // for is selected
		
		///WebElement gmail =  driver.findElement(By.xpath("//div//div//div//div[1]//div//div[1]//a"));
		//String abc  = gmail.getText();                       // get text method only for link text
		//System.out.println(abc);
		
		//WebElement gmail =  driver.findElement(By.xpath("//div//div//div//div[1]//div//div[1]//a"));
		//boolean abc  = gmail.isDisplayed();                      // is displayed
		//System.out.println(abc);
		
		//WebElement gmail =  driver.findElement(By.xpath("//div//div//div//div[1]//div//div[1]//a"));
		//boolean abc  = gmail.isEnabled();                    // is Enabled
		//System.out.println(abc);
		
		WebElement cbox =  driver.findElement(By.id("vfb-7-1"));
		boolean abc  = cbox.isSelected();                    // is selected 
		System.out.println(abc);
}
}