import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test(groups = "demo")
	public void beta()
	{
		System.out.println("beta Test");
	}
	@Test(groups = "UI Test")
	public void alpha()
	{
		System.out.println("alpha Test");
	}
	@BeforeSuite
	public void b()
	{
		System.out.println("BeforeSuite annotation");
	}
	@AfterSuite
	public void c()
	{
		System.out.println("AfterSuite annotation");
	}
	@BeforeTest
	public void d()
	{
		System.out.println("BeforeTest annotation");
	}
	@AfterTest
	public void e()
	{
		System.out.println("AfterTest annotation");
	}
	@BeforeMethod
	public void f()
	{
		System.out.println("BeforeMethod annotation");
	}
	@AfterMethod
	public void g()
	{
		System.out.println("AfterMethod annotation");
	}
	@BeforeClass
	public void h()
	{
		System.out.println("BeforeClass annotation");
	}
	@AfterClass
	public void i()
	{
		System.out.println("AfterClass annotation");
	}

}
