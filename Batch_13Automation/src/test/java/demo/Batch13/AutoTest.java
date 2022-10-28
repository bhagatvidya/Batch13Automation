package demo.Batch13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoTest {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//casting up 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.close();
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.close();
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.close();
		
		WebDriverManager.operadriver();
		driver=new OperaDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		/*WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000);*/
		
		
		
	}

}
