package Practice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class AmazonDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("iphone 13");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		//Scrolling window
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");
		//Click on mobile
		Thread.sleep(2000);
		WebElement clickmob=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		clickmob.click();
		
		//child window handling
		Set<String> Ids=driver.getWindowHandles();//get all id's
		List<String> list=new ArrayList(Ids); // set to list convert 
		
		String parent=list.get(0);
		System.out.println(parent);
		
		String child=list.get(0);
		System.out.println(child);
		driver.switchTo().window(child);	// switch the window parent to child
		
		//get text of mobile and price
		WebElement mob=driver.findElement(By.xpath("//span[@id='productTitle']"));
		String mobname=mob.getText();
		System.out.println("Mobile Name="+mobname);
		WebElement mobprice=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]"));
		String price=mobprice.getText();
		System.out.println("Mobile Price="+price);
		//Scrolling down 
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200)","");
		Thread.sleep(5000);
		String rm=RandomString.make(4);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tss=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\"+rm+".png");
		FileUtils.copyFile(tss, dest);
		Thread.sleep(3000);
		
		//Add to cart
		WebElement addcart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addcart.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//cart screenshot
		WebElement gotocart=driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));	
		gotocart.click();
		//Delete cart
		WebElement delcart=driver.findElement(By.xpath("//input[@name='submit.delete.Cacf7656e-e852-4cb5-8c57-9c2e63818b2a']"));
		delcart.click();
		Thread.sleep(5000);
		//Get text by empty cart
		WebElement empty=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
		String strem=empty.getText();
		System.out.println("Output -"+strem);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File tss1=ts1.getScreenshotAs(OutputType.FILE);
		File tdest1=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\"+rm+".png");
		FileUtils.copyFile(tss1, tdest1);
		Thread.sleep(5000);
		driver.close();

	}

}
