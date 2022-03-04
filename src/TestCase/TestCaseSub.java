package TestCase;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import JUnite.Subtraction;



public class TestCaseSub {

	@Test
	public void test() 
	{
		Subtraction obj2=new Subtraction();
		int result=obj2.subtraction(10,5);
		
		Assert.assertEquals(5,result);
	}

}
