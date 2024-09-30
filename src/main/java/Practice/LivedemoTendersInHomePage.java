package Practice;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class LivedemoTendersInHomePage {


	@Test
	public  void test1() throws InterruptedException {
		WebDriver driver;
	
	        // Initialize WebDriver
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://livedemo.euniwizarde.com");
	        Thread.sleep(4000);

	        // Navigate to the correct page based on the input string

	         driver.findElement(By.xpath("//a[contains(text(),'Tenders Due for Open')]")).click();
	    
	        Thread.sleep(3000);
	        
	        String captcha = driver.findElement(By.id("generatedCaptcha")).getText();
	        driver.findElement(By.id("captchainput")).sendKeys(captcha);
	        driver.findElement(By.id("button")).click();
	        Thread.sleep(3000); 
	        
	           
	        WebElement ele =driver.findElement(By.xpath("//td[contains(text(),'Test-Tender-01')]//parent::tr//child::div/i[@title='View Documents/Details']"));
	        ele.click();
	        
	        driver.findElement(By.xpath("//a[contains(text(),'View Tender Item')]")).click();
	        
	        Set<String> set = driver.getWindowHandles();
	        
	         Iterator<String> itr = set.iterator();
	         String Parent=itr.next();
	         String Child=itr.next();
	         
	         driver.switchTo().window(Child);

	         driver.manage().window().maximize();
	         
	         
	         
	         String Expected_TCA= "Yes";
	         String Actual_TCA= driver.findElement(By.xpath("//th[text()='Tender Cum Auction ']//following-sibling::td")).getText();
	         
	         System.out.println(Actual_TCA);
	      	         
	         if(Actual_TCA.equals(""))
	         {
	           Assert.fail("Tend Cum Auc value is Null");
	          }
	         
	        driver.quit();
	    }
	}
