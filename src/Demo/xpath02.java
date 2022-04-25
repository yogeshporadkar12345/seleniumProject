package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath02 {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
	    Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//a[text()='Gmail']")).click();               // xpath by text
		
//		driver.findElement(By.xpath("//a[contains(text(),'Gm')]")).click();       // xpath by contains
		
//		driver.findElement(By.xpath("//a[@class='gb_d'][1]")).click();           // xpath by index
		
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a")).click();      //xpath by absolute
		
		driver.findElement(By.xpath("//div//div//div//div[1]//div//div[1]//a")).click();
		
		
}
}