import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
	
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
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, "ToolsQA");
		sa.assertEquals(actual, expected);
		System.out.println("Two validations");
		sa.assertAll();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
