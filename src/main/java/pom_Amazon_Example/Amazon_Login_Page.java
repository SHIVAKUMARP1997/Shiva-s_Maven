package pom_Amazon_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_Login_Page {
	// Step 1: Finding each element Using @FingBy Annotation.
	
	// Syntax: @FindBy(Locator = "value")  ReturnType Ref_Variable;
	
	WebDriver driver;
	
	@FindBy(id = "nav-link-accountList-nav-line-1") WebElement Frst_Login_Button;
	@FindBy(name = "email") WebElement Username;
	@FindBy(className = "a-button-input") WebElement Continue_Click_Button;
	@FindBy(id = "ap_password") WebElement Password;
	@FindBy(xpath = "//input[@class=\"a-button-input\"]") WebElement SignIn_button;
	@FindBy(className ="a-list-item") WebElement password_Error;
	@FindBy(xpath = "//div/div/h1") WebElement createAccount_dialogue;
	@FindBy(xpath = "//ul/li/span") WebElement createAccount_dialogue2;

	
	// Step 2: Create a Sepersate methods fro each componetb to perform its action.
		
	public void UN() {
		Frst_Login_Button.click();
		Username.sendKeys("kumarpshivap1@gmail.com");
		Continue_Click_Button.click();
		if(createAccount_dialogue.isDisplayed()||createAccount_dialogue2.isDisplayed()) {
		 Assert.assertFalse(true, "need to create an account");
		}
		
	}
			
	
	public void PWD() {
		
		Password.sendKeys("Shivv@dummyAccount");
		
	}
	
	public void SignIN() {
		
		SignIn_button.click();
		boolean val = password_Error.isDisplayed();
		
		if(val){
			Assert.assertFalse(val);
			System.err.println("Password Error");
			}
	}
		
	// Step 3: initialization of each element using PageFactory Class inside the constructor of the class..
	
	public Amazon_Login_Page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		}
	
	
	
	
	
	

}
