package JavaPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownValuePrint {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//driver.findElement(By.)

	}

}
