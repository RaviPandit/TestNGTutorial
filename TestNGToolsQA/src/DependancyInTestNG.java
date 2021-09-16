import org.testng.annotations.Test;

public class DependancyInTestNG extends SuperClassForDependancy{
	
	@Test(dependsOnMethods = {"openbrowser"})
	public void logIn()
	{
		System.out.println("This is login method");
	}
	@Test
	public void logout()
	{
		System.out.println("This is logout method");
	}
	@Test(dependsOnMethods = {"setUp"})
	public void openbrowser()
	{
		System.out.println("This is open browser method");
	}
	

}
