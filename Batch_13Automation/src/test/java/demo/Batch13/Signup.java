package demo.Batch13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement createbt=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createbt.click();
		Thread.sleep(4000);
		WebElement Fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Fname.sendKeys("Vidya");
		WebElement Lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Lname.sendKeys("Bhagat");
		WebElement eid=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		eid.sendKeys("vids@gmail.com");
		WebElement confirmid=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmid.sendKeys("vids@gmail.com");
		
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("vidsswara@12345");
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByValue("24");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Nov");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByValue("1990");
		WebElement Fmale=driver.findElement(By.xpath("//input[@value='1']"));
		Thread.sleep(4000);
		Fmale.click();
		System.out.println("Registration done");
		
		
		//WebElement submit=driver.findElement(By.xpath("//button[@id='u_a_s_va']"));
		//submit.click();
		

	}

}
