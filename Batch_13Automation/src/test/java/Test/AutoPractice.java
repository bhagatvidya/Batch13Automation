package Test;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class AutoPractice {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//get link
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Select T-shirt option
		WebElement Tbtn=driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		Tbtn.click();
		//Page scrolling 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","" );
		//select filter options
		Thread.sleep(2000);
		WebElement Sizebox=driver.findElement(By.xpath("//div[@id='uniform-selectProductSort']"));
		Sizebox.click();

		Select s=new Select(driver.findElement(By.id("selectProductSort")));
		
	
		s.selectByVisibleText("Price: Lowest first");
		 String rm1=RandomString.make(4);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File tss=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\"+rm1+".png");
			FileUtils.copyFile(tss, dest);
		//Add to compare
		Thread.sleep(2000);
		 Actions actions = new Actions(driver);
	        //select product perform mouse hover 
	    	WebElement prod = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	       	actions.moveToElement(prod).build().perform();
		WebElement addTocompare=driver.findElement(By.xpath("//a[text()='Add to Compare']"));
        addTocompare.click();
    	Thread.sleep(2000);
        //click on compare btn
        WebElement comparebtn=driver.findElement(By.xpath("(//span[text()='Compare ('])[2]"));
        actions.doubleClick(comparebtn).build().perform();
	
		//Delete prod 
        TakesScreenshot ts1=(TakesScreenshot)driver;
		File tss1=ts1.getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\"+rm1+".png");
		FileUtils.copyFile(tss1, dest1);
		
		WebElement del=driver.findElement(By.xpath("//i[@class='icon-trash']"));
		del.click();
		//actions.doubleClick(prod).build().perform();
		
		TakesScreenshot ts4=(TakesScreenshot)driver;
		File tss4=ts4.getScreenshotAs(OutputType.FILE);
		File dest4=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\"+rm1+".png");
		FileUtils.copyFile(tss4, dest4);
		Thread.sleep(3000);
		
		//Scrolling up 
		js.executeScript("window.scrollBy(0,-1000)","" );
		//go to home page click on logo
		WebElement home=driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
		actions.doubleClick(home).build().perform();
		TakesScreenshot ts2=(TakesScreenshot)driver;
		File tss2=ts2.getScreenshotAs(OutputType.FILE);
		File dest2=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\"+rm1+".png");
		FileUtils.copyFile(tss2, dest2);
		//driver.close();
		System.out.println("Automation Practice test case Done.");
	}
	
		
		

		
		
	

	}


