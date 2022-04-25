package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath01 {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
	    Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();  //xpath by atribute name
		

}
}