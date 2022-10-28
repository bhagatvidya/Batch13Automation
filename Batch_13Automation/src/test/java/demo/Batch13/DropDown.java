package demo.Batch13;


import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement eid=driver.findElement(By.xpath("//input[@id='email']"));
		eid.sendKeys("vids@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("vids@gmail.com");
		
		WebElement createbt=driver.findElement(By.xpath("//button[@name='login']"));
		createbt.click();
		List<WebElement> allelements=driver.findElements(By.xpath("//a"));
		System.out.println("allelements.size()");
		Iterator<WebElement> it=allelements.iterator();
		While(it.hasNext());
		{
			WebElement singleEle=it.next();
			String s=singleEle.getText();
			if(s.equals("Find your account and log in.... "))
			{
				System.out.println(s+"is the text of element");
				singleEle.click();
			}
			System.out.println(singleEle.getText());
		}
		
		
		
		
		
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

	

}