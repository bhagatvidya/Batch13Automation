package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePOM {
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	private WebElement txtemail;
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement txtpass;
	

}
