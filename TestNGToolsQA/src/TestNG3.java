import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNG3 {
	
	WebDriver driver;
	
  @Test
  public void verifyTitle() {
	  
	  String currectDir = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", currectDir + "./Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.toolsqa.com/testng/testng-test/");
	  String pageTitle = driver.getTitle();
	  Assert.assertEquals(pageTitle, "Tools QA - How to Write TestNG Test Case (with examples) | ToolsQA");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Starting test on chrome browser");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  System.out.println("Test is done");
  }

}
