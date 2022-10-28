package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class youtubAutomation {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		Thread.sleep(3000);
		search.sendKeys("on my way alan walker");
		Thread.sleep(3000);
		WebElement searchbtn=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		searchbtn.click();
		Thread.sleep(3000);
		//WebElement play=driver.findElement(By.xpath("//a[@id='video-title']"));
		WebElement play=driver.findElement(By.xpath("//a[@id='video-title']"));
		play.click();
		Thread.sleep(3000);
		WebElement skipadd=driver.findElement(By.xpath("//div[@id='ad-text:k']"));
		skipadd.click();
		
	}

}
