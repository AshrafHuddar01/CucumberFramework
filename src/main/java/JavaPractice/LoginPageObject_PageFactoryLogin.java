package JavaPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject_PageFactoryLogin {
	
	WebDriver driver;
	
	@FindBy(id="closeModal")
	WebElement PopClose;
	
	@FindBy(id="loginId")
	WebElement User_ID;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="button")
	WebElement SubmitButton;
	
	public LoginPageObject_PageFactoryLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String UserID, String PWD) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(PopClose)).click();
		
		User_ID.sendKeys(UserID);
		Password.sendKeys(PWD);
		SubmitButton.click();
		
	}

}
