import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter {
	
	@Test
	@Parameters({"message"})
	public void printMsg(@Optional("This is a optional message") String msg)
	{
		System.out.println(msg);
	}

}
