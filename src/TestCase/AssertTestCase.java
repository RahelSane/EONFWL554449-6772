package TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class AssertTestCase {


	@Test
	public void test1() 
	{
		String s1=null;
		String s2="Rahel";
		
		assertNotNull(s2);
	}
	@Test
	public void test2() 
	{
		String s1=null;
		String s2="Sane";
		
		assertNull(s1);
	}
	@Test
	public void test3() 
	{
		String s1="Rajesh";
		String s2="Rajesh";
		
		assertSame(s1,s2);
	}
	@Test
	public void test4() 
	{
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		
		assertArrayEquals(arr1,arr2);
	}
	@Test
	public void test5()
	{
		int a=5;
		int b=5;
		int c=a+b;
		
		assertTrue(c==10);
		assertFalse(c==11);
	}

}
