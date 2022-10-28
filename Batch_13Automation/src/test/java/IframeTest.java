import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/automation/iframe.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame(1);// index
		//driver.switchTo().frame("Selenium");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
		driver.switchTo().frame(iframe);
		WebElement menuopt=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		menuopt.click();
		
		
		driver.switchTo().defaultContent(); // main page 
		
		driver.switchTo().parentFrame(); // child iframe --> parent switch
		driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
		

	}

}
