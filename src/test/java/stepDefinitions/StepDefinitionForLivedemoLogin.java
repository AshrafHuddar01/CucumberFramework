package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitionForLivedemoLogin {
	WebDriver driver;
	@Given("given both valid credentials")
	public void given_both_valid_credentials() {
	//System.setProperty("webdriver.chrome.driver", "/Cucumber/ChromeDriver/chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://livedemo.euniwizarde.com");
	}
	
	//@When("^enters username \"([^\"]*)\" and password \"([^\"]*)\" and click Submit button$")  //this is when no scenario outline
	@When("^enters \"([^\"]*)\" and \"([^\"]*)\" and click Submit button$")  //this is when scenario outline
	public void enters_username_and_password_and_click_submit_button(String username, String password) {
	driver.findElement(By.id("loginId")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	String Captcha =driver.findElement	(By.id("generatedCaptcha")).getText();
	driver.findElement(By.id("captchainput")).sendKeys(Captcha);
    driver.findElement(By.id("button")).click();
	}
	@SuppressWarnings("deprecation")
	@Then("Open PKI login page")
	public void open_pki_login_page() {
    String currentURL=driver.getCurrentUrl();
    System.out.println(currentURL);
    String expectedURL= "https://livedemo.euniwizarde.com/login/validateLogin";
    Assert.assertEquals(expectedURL, currentURL);
    
   
     if (driver != null) {
            driver.quit();
        
    }
    
	}

}
