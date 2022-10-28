package demo.Batch13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandel {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement alertop=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alertop.click();
		Thread.sleep(5000);
		WebElement clickbtn=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickbtn.click();
		Thread.sleep(5000);
		
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
		//alrt.dismiss();
		Thread.sleep(3000);
		driver.close();
	}

}
