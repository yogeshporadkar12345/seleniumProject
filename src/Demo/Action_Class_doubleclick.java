package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_doubleclick {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();


		WebElement doubleClick = driver.findElement(By.name("dblClick"));

		Actions actions=new Actions(driver);
		actions.doubleClick(doubleClick).build().perform();
		}


}
