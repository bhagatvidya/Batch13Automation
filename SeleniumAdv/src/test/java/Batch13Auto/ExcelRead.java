package Batch13Auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		String filepath=("C:\\Users\\vidya\\eclipse-workspace\\SeleniumAdv\\DataExcel\\Data1.xlsx");
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		String d1=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String uid=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		String pass=wb.getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
		String url=wb.getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
	    System.out.println(d1);
	    System.out.println(uid);
	    System.out.println(pass);
	    System.out.println(url);
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	    WebElement eid=driver.findElement(By.xpath("//input[@id='email']"));
	    eid.sendKeys(uid);
	    WebElement epass=driver.findElement(By.xpath("//input[@id='pass']")); 
	    epass.sendKeys(pass);

	}

}
