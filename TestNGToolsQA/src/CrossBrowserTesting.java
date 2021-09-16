import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browserName)
	{
		String currentDir = System.getProperty("user.dir");
		
	if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", currentDir + "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.toolsqa.com/testng/cross-browser-testing-using-testng/");
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", currentDir + "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();			driver.get("https://www.toolsqa.com/testng/cross-browser-testing-using-testng/");
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", currentDir + "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}
	else
		{
			System.setProperty("webdriver.edge.driver", currentDir + "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.toolsqa.com/testng/cross-browser-testing-using-testng/");
		}
	}
	
	@Test
	public void verifyTitle()
	{
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Tools QA - How to perform cross browser testing using testng with Selenium?");
		System.out.println("Test");
		
	}
	
	@AfterClass
	public void closeBroser()
	{
		driver.close();
	}

}
