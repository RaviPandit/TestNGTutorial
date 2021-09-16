import org.testng.annotations.Test;

public class DependenciesInXML {
	
	@Test(groups = "register")
	public void register()
	{
		System.out.println("This is register test");
	}
	@Test(groups = "login")
	public void login()
	{
		System.out.println("This is login test");
	}
	@Test(groups = "logout")
	public void logout()
	{
		System.out.println("This is logout test");
	}

}
