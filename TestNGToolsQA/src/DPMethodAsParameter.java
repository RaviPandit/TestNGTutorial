import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPMethodAsParameter {
	
	@DataProvider(name = "dataProvider")
	public Object[][] dpMethod(Method m)
	{
		if(m.getName().equals("sum"))
		{
			return new Object[][] {{2,3,5},{4,5,9}};
		}
		else
		{
			return new Object[][] {{2,3,-1},{4,5,-1}};
		}
	}
	
	@Test(dataProvider = "dataProvider")
	public void sum(int a, int b, int result)
	{
		int sum = a + b;
		Assert.assertEquals(sum, result);
	}
	
	@Test(dataProvider = "dataProvider")
	public void sub(int a, int b, int result)
	{
		int sub = a - b;
		Assert.assertEquals(sub, result);
	}

}
