package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement eid=driver.findElement(By.xpath("//input[@id='email']"));
		eid.sendKeys("vids@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("vids@gmail.com");
		
		WebElement fpass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		System.out.println(fpass.getText());
		
		WebElement Apass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		System.out.println(Apass.getText());
		if(fpass.equals(Apass))				//we can use validation for match the expected and actual result 
		{
			System.out.println("Pass");
		}
		
		
	}
		

	

}
