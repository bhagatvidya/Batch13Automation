package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//input[@name='email']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='vids.bhagat24@gmail.com'",ele);
		Thread.sleep(4000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		js.executeScript("arguments[0].value='vids.bhagat24'",pass);
		
		
	}

}
