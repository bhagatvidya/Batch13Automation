package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Rightclick {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.contextClick(ele).click(ele).build().perform();
		WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		act.contextClick(ele).click(quit).build().perform();
		
	

	}

}
