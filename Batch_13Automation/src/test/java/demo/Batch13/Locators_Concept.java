package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Concept {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//WebElement email_Tab=driver.findElement(By.name("email"));//By name element
		//email_Tab.sendKeys("vidya.bhagat06@gmail.com");
		
		WebElement email_Tab=driver.findElement(By.id("email"));//By Id element
		email_Tab.sendKeys("vids06@gmail.com");
		
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("qazse");
		
		//driver.quit();
		
	}

}
