package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/soft/abcd/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(2000);
		
	    Set<String> s= driver.getWindowHandles();  //002  001
	    System.out.println(s);
	    
		Iterator<String> it = s.iterator();       //001 002
	
	    it.next();
	  	String w2nd = it.next();
	  	
	  
	  
	    driver.switchTo().window(w2nd);
	   
	    Thread.sleep(2000);
	    	
	    
	    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("btnLogin")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Click Here")).click();
	
		
	}

}



