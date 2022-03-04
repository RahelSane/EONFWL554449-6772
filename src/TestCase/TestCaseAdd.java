package TestCase;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import JUnite.Addition;

public class TestCaseAdd {

	@Test
	public void test()
	{
		Addition obj1=new Addition();
		int result=obj1.addition(5, 5);
		
		Assert.assertEquals(10,result);
	}

}
