package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> a = driver.findElements(By.tagName("li"));
		int size = a.size();
		System.out.println(size);
		for(int i=0;i<=size-1;i++) {
			String abc = a.get(i).getText();
			System.out.println(abc);
			Thread.sleep(1000);
		}
	}
}

			
		
	


