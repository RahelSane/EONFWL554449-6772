package TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import JUnite.Multiplication;
import JUnite.Subtraction;

public class TestCaseMult {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		Multiplication obj3=new Multiplication();
		int result=obj3.multiplication(10,5);
		
		Assert.assertEquals(50,result);
	}

}
