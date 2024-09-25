package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tag1TenderSearchSteDef {

	WebDriver driver;

	@Given("I navigate to the {string} page")
	public void i_navigate_to_the_page(String pageName) throws InterruptedException {
		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://livedemo.euniwizarde.com");
		Thread.sleep(4000);

		// Navigate to the correct page based on the input string
		if (pageName.equals("Tenders Due for Open")) {
			driver.findElement(By.xpath("//a[contains(text(),'Tenders Due for Open')]")).click();
		} else if (pageName.equals("Opened and Awarded Tenders")) {
			driver.findElement(By.xpath("//a[contains(text(),'Opened and Awarded Tenders')]")).click();
		} else if (pageName.equals("Cancelled Tenders")) {
			driver.findElement(By.xpath("//a[contains(text(),'Cancelled Tenders')]")).click();
		}
		Thread.sleep(3000);
	}

	@When("Search tender as {string}, enter the captcha and click the search button")
	public void search_tender_as_enter_the_captcha_and_click_the_search_button(String tenderNumber) throws InterruptedException {
		// Enter the captcha and click the search button
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(tenderNumber);
		String captcha = driver.findElement(By.id("generatedCaptcha")).getText();
		driver.findElement(By.id("captchainput")).sendKeys(captcha);
		driver.findElement(By.id("button")).click();
		Thread.sleep(3000);
	}

	@And("I click \"View Documents\\/Details\" and \"View Tender Item\"")
	public void i_click_view_documents_details_and_view_tender_item() {
		// Click on "View Documents/Details" and then "View Tender Item"
		WebElement ele = driver.findElement(By.xpath("(//i[@title='View Documents/Details'])[1]"));
		ele.click();
		driver.findElement(By.xpath("//a[contains(text(),'View Tender Item')]")).click();

		Set<String> set = driver.getWindowHandles();

		Iterator<String> itr = set.iterator();
		String Parent = itr.next();
		String Child = itr.next();

		driver.switchTo().window(Child);

		driver.manage().window().maximize();

	}

	@Then("the Tender Cum Auction should be {string}")
	public void the_tender_cum_auction_should_be(String auctionStatus) {
		String Actual_TCA = driver.findElement(By.xpath("//th[text()='Tender Cum Auction ']//following-sibling::td")).getText();
		
		if (Actual_TCA.equals("")) {
			Assert.fail("Tend Cum Auc value is Null");
		}
		
		System.out.println("Tender Cum Auction actual value is " +Actual_TCA);

	}

	@And("I close the browser")
	public void i_close_the_browser() {
		// Close the browser
		driver.quit();
	}
}
