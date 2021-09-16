import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/testng/testng-asserts/");
		Reporter.log("Browser opened");
	}
	
	@Test
	public void verifyTitle()
	{
		String expected = "Tools QA - How To Use TestNG Asserts with Selenium To Perform Validation?";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected, "Title does not match.");
		Reporter.log("Title verified");
		System.out.println("Test one is passed");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("Browser Closed After Testing");
	}

}
