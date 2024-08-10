package testNG_Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 
 * Create a test case for amazon login, 
 * Create test case for Shoe or any product search, 
 * Create test case for selecting a product, 
 * create teat case for adding to cart or wishlist, 
 * finally logout of the application. 
 * run all cases as a suite
 */

public class Sel_Assignments183 {

	@Test
	public void Ligin_TO_Amazon() throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MAVEN_with_TestNG\\DDT_data\\datafile.xlsx");
		Workbook wrkbk = WorkbookFactory.create(file);
		String Usrname = wrkbk.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Pssword = wrkbk.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();

		
		driver.findElement(By.id("ap_email")).sendKeys(Usrname);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("@"+Pssword);
		driver.findElement(By.id("signInSubmit")).click();
		
		
	}
	
	
	
	
	
	
}
