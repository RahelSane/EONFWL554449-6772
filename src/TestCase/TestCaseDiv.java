package TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import JUnite.Division;
import JUnite.Subtraction;

public class TestCaseDiv {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test()
	{
		Division obj4=new Division();
		int result=obj4.division(10,10);
		
		Assert.assertEquals(1,result);
	}

}
