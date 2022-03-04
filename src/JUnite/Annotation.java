package JUnite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Annotation
{
	@Before
	public void input()
	{
		System.out.println("Before Class Method");
	}
	@After
	public void show()
	{
		System.out.println("After Class Method");
	}
	@Test
	public void display()
	{
		System.out.println("This Is Test Class");
	}
}
