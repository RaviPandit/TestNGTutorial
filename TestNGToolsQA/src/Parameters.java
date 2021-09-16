import org.testng.annotations.Test;

public class Parameters {
	
	
	@org.testng.annotations.Parameters ({"val1", "val2"})
	@Test
	public void sum(String v1, String v2)
	{
		String sum = v1 + v2;
		System.out.println(sum);
	}
	
	@org.testng.annotations.Parameters ({"val1", "val2"})
	@Test
	public void sub(int val1, int val2)
	{
		int sub = val1 - val2;
		System.out.println(sub);
	}

}
class Parameterscopy {
	
	
	@org.testng.annotations.Parameters ({"val1", "val2"})
	@Test
	public void mul(int val1, int val2)
	{
		int mul = val1 * val2;
		System.out.println(mul);
	}
}
