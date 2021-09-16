import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGReports {
	
	WebDriver driver;
	
	@Test
	public void reports1()
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Tools QA - How To Generate TestNG Reports and How to use with Selenium?");
		Reporter.log("Test is passed.");
	}
	@BeforeMethod
	public void openbrowser()
	{
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Chrome browser is opened successfully.");
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/testng/testng-reports/");
		Reporter.log("Valid URL is opened successfully.");
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
		Reporter.log("Browser is closed successfully.");
	}

}
class TestNGReports2 {
	
	WebDriver driver;
	
	@Test
	public void reports2()
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Tools QA  How To Generate TestNG Reports and How to use with Selenium?");	
	}
	@BeforeMethod
	public void openbrowser()
	{
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/testng/testng-reports/");
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

}
