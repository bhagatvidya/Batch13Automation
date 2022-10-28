package demo.Batch13;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class GoogleMeetAuto {

			public static void main(String[] args) throws Exception {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://meet.google.com/");
				Thread.sleep(3000);
				driver.manage().window().maximize();
				WebElement nwMeet=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
				Thread.sleep(3000);
				nwMeet.click();
				Thread.sleep(3000);
				WebElement createMeet=driver.findElement(By.xpath("//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c']"));
				createMeet.click();
				Thread.sleep(3000);
	}

}
