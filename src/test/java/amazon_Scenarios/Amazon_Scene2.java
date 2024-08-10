package amazon_Scenarios;
//2. serach mobile->click on the 1st mobile	

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Amazon_Scene2 extends AmazonLaunch_Close{
	
	@Test(priority=2)

	public void Scene2() {
		
	WebElement Searchfld = driver.findElement(By.id("small-searchterms"));	
	Searchfld.sendKeys("Computer");
	Searchfld.sendKeys(Keys.ENTER);
	
	WebElement firstItem = driver.findElement(By.xpath("(//div[@class='product-item'])/div/a/img[1]"));
	firstItem.click();
	
	Assert.assertEquals(driver.findElement(By.id("add-to-cart-button-72")).isDisplayed(), true, "Expected page is not Opened");
	
	System.out.println("Testcase 2 passed");
	
	}

}
