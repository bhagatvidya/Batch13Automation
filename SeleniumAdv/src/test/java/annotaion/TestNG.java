package annotaion;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



public class TestNG {
	
	@BeforeMethod
	public void testBM() 
	{
		
		System.out.println("Before Method");
	}
	
	@Test(priority=1)
	public void testa() 
	{
		System.out.println("Test a");
	}
	@Test(priority=0)
	public void testb() 
	{
		System.out.println("Test b");
	}
	@Test(priority=3,enabled=false)
	public void testz() 
	{
		System.out.println("Test z");
	}
	@Test(priority=4,invocationCount=4)
	public void tests() 
	{
		System.out.println("Test s");
	}
	
	@AfterMethod
	public void testAM() 
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void testAC() 
	{
		System.out.println("After class");
	}
	@AfterTest
	public void testAT() 
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void testAS() 
	{
		System.out.println("After suite");
	}

}
