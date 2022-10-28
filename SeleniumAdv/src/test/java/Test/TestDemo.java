package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// WebElement -- Action -- email ,password ,login btn
		
		LoginPOM ln=PageFactory.initElements(driver, LoginPOM.class);
		
		
		ln.gettxt_email().sendKeys("vidya24@gmail.com");
		ln.gettxt_password().sendKeys("vids24");
		
	}

}
