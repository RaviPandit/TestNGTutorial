import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name = "datapro")
	public Object[][] dataProviderMethod()
	{
		return new Object[][] {{"Pankaj"}, {"Koriya"}};
	}
	
	@Test(dataProvider = "DataProSaparate", dataProviderClass = DataProviderSaparate.class)
	public void printValues(String val)
	{
		System.out.println(val);
	}
}
