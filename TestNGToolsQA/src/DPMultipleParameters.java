import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPMultipleParameters {
	
	@DataProvider(name = "DPmulvalues")
	public Object[][] dpmethod()
	{
		return new Object[][] {{2,3,5}, {5,7,9}};
	}
	
	@Test(dataProvider = "DPmulvalues")
	public void sum(int a, int b, int result)
	{
		int sum = a + b;
		Assert.assertEquals(result, sum);
		
	}

}
