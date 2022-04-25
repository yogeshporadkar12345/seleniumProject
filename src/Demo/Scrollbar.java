package Demo;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {
	
	public static void main (String[]args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		JavascriptExecutor   j  =  (JavascriptExecutor)driver;

		j.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(2000);

		j.executeScript("window.scrollBy(0,-1000)");
		
		j.executeScript("window.scrollBy(0,2000)");
		}

		


}

