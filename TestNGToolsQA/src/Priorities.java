import org.testng.annotations.Test;

public class Priorities {
	
	@Test(priority= 3)
	public void apple()
	{
		System.out.println("This is apple method");
	}
	@Test(priority = 2)
	public void banana()
	{
		System.out.println("This is banana method");
	}
	@Test(priority = 1)
	public void orange()
	{
		System.out.println("This is oragne method");
	}
	@Test
	public void grapes()
	{
		System.out.println("This is grapes method");
	}
	@Test
	public void guava()
	{
		System.out.println("This is guava method");
	}

}
