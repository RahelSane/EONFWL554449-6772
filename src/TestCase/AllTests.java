package TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCaseAdd.class, TestCaseDiv.class, TestCaseMult.class, TestCaseSub.class })
public class AllTests 
{
	@Before
	public void input()
	{
		System.out.println("Before Annotation");
	}
	
	@Test
	public void output()
	{
		System.out.println("Test Annotation");
	}
	
	@After
	public void show()
	{
		System.out.println("After Annotation");
	}
}

class ABC
{
	@BeforeClass
	public static void dispaly()
	{
		System.out.println("Before Class Annotation");
	}
	@AfterClass
	public static void print()
	{
		System.out.println("After Class Annotation");
	}
}
