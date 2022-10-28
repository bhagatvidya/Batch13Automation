package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLocator {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//WebElement email_Tab=driver.findElement(By.name("email"));
		//email_Tab.sendKeys("abs@gmail.com");
		
		WebElement email_Tab=driver.findElement(By.id("email"));
		email_Tab.sendKeys("abs@gmail.com");
		

	//	WebElement pass_Tab=driver.findElement(By.id("pass"));
//		pass_Tab.sendKeys("abs@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("azxcvb");
		
		
		
		
		
		
		
		
		
				
		

	}

}
