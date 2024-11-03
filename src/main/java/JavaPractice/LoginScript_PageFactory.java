package JavaPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginScript_PageFactory {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void Setup() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://test.ewizard.in");
	}
	
	@Test
	
	public void LoginTest() {
		
		LoginPageObject_PageFactoryLogin page = new LoginPageObject_PageFactoryLogin(driver);
		page.login("TESTBUYER02","Ashraf@123");
	}

}
