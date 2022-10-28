package demo.Batch13;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intro_script {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();//setup the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");   //launching url script
		Thread.sleep(7000);
		driver.manage().window().maximize();
		String fb_title=driver.getTitle();
		System.out.println(fb_title);
		String fb_url=driver.getCurrentUrl();
		System.out.println(fb_url);
		driver.navigate().to("https://www.naukri.com/");// navigate to other url page
		String n_title=driver.getTitle();
		System.out.println(n_title);
		String n_url=driver.getCurrentUrl();
		System.out.println(n_url);
		Thread.sleep(4000);
		driver.navigate().refresh();//refresh the page
		Thread.sleep(4000);
		driver.navigate().back();//page navigate to back
		Thread.sleep(4000);
		driver.navigate().forward();// navigate to forward

	}

}
