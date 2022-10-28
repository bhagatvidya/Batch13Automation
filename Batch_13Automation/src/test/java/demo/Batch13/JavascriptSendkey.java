package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptSendkey {

	public static void main(String[] args) throws Exception  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor Sc=(JavascriptExecutor)driver;
		Sc.executeScript("window.srollBy(0,5000)","");
		
		Thread.sleep(4000);
		Sc.executeScript("window.srollBy(0,-500)","");
		WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
		Sc.executeScript("arguments[0].scrollIntoView()",ele);

	}

}
