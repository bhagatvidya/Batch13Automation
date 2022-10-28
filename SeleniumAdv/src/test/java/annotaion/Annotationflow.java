package annotaion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationflow {
	WebDriver driver;

	@BeforeSuite
	public void testBS() 
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void testBT() 
	{
		System.out.println("Before test");
	}
	@BeforeClass
	public void testBC() 
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void testBM() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() 
	{
		System.out.println("Test");
	}
	@AfterMethod
	public void testAM() 
	{
		driver.close();
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
