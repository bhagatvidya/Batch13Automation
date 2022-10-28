package Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test_Assert {

	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/?trk=guest_homepage-basic_nav-header-logo");
		driver.manage().window().maximize();
		
		//Assert 
		String expectTitle="LinkedIn India: Log In or Sign Up";
		String actualTitle=driver.getTitle();
		//verify
		Assert.assertEquals(actualTitle, expectTitle, actualTitle);
		driver.close();
	}
	@Test
	public void test2() {
		SoftAssert soft=new SoftAssert();
		List<String>list1=new ArrayList();
		list1.add("Samsung");
		list1.add("iphone");
		
		List<String>list2=new ArrayList();
		list2.add("Samsung");
		list2.add("iphone");
		soft.assertEquals(list1, list2);
		
		System.out.println("Test case closed");
		soft.assertAll();
	}	
		
	}
	

