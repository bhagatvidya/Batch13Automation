package Practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Autosuggesion {

	
		@Test
		public void test1() throws Exception {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("maven repository");
		Thread.sleep(4000);
		
		List<WebElement> li=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		Thread.sleep(5000);
		System.out.println(li.size());
		Thread.sleep(2000);
		for(int i=0;i<li.size();i++)
		{
			String txt=li.get(i).getText();
			System.out.println(txt);
		
		if(txt.equals("maven repository types"))
		 {
			li.get(i).click();
			break;
		 }
		}
		
	}

}
