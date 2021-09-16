import org.testng.annotations.Test;

public class GroupDependancy {
	
	@Test(groups = "Login")
	public void zosa()
	{
		System.out.println("This is user name method");
	}
	@Test(groups = "Login")
	public void password()
	{
		System.out.println("This is password method");
	}
	@Test(groups = "Login")
	public void loginButton()
	{
		System.out.println("This is loginButton method");
	}
	@Test(dependsOnGroups = "Login")
	public void logout()
	{
		System.out.println("This is logout method");
	}
	@Test
	public void koyal()
	{
		System.out.println("This is Simple method");
	}

}
