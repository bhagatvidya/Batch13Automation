package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMouse {

	public static void main(String[] args) throws Exception  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		//Action ---WebEle--->Mouse Hover
		WebElement ob=driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		ac.moveToElement(ob).build().perform();
  	
		//Drag and drop 
//		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
//		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		ac.dragAndDrop(src, dest).build().perform();
//		
	}

}
