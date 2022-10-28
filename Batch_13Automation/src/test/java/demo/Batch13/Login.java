package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement eid=driver.findElement(By.xpath("//input[@id='email']"));
		eid.sendKeys("vids@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("vids@gmail.com");
		
		

	}

}
