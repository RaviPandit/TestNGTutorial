import org.testng.annotations.DataProvider;

public class DataProviderSaparate {
	
	@DataProvider(name = "DataProSaparate")
	public Object[][] dp()
	{
		return new Object[][] {{"Jay"}};
	}

}
