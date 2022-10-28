package demo.Batch13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//Full page ScreenShot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\test.png");
		FileUtils.copyFile(src, dest);
		//half screenshot
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File s1=logo.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\vidya\\eclipse-workspace\\Batch_13Automation\\Screenshot\\logo1.png");
		FileUtils.copyFile(s1, d1);
		
		
	}

}
