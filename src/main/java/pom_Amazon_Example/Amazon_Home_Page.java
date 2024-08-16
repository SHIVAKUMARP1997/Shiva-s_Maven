package pom_Amazon_Example;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_Home_Page {
	
	WebDriver driver;
	
// Step 1: Finding each element Using @FingBy Annotation.
	
	@FindBy(id = "twotabsearchtextbox" ) WebElement search_txt_field;
	@FindBy(xpath = "//a/div/img[@data-image-index=\"1\"]" ) WebElement first_Item;
	

// Step 2: Create a Sepersate methods for each components to perform its action.
	public void srch_first_item() {
		search_txt_field.sendKeys("Shoe");
		search_txt_field.sendKeys(Keys.ENTER);
		Assert.assertTrue(first_Item.isEnabled());
		first_Item.click();
	}
	
	
	
	
	
// Step 3: initialization of each element using PageFactory Class inside the constructor..
	
	public Amazon_Home_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	
}
