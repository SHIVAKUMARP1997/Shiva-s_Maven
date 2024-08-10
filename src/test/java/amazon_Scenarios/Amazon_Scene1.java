package amazon_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. Serach shoe->click on 1st shoe	
5. serach camera->click on 15th camera	
6. after launch->click on electronics major tab->select brand as redmi	
7. launch home page->dropdown->amazon fresh->serach for mango	
8. launch home page->dropdown->serach for "power of mind"->click on the 1st product	
9.Launch home page->click on todays deals->deals of the day->click on the 1st product 	
10. serach shoe->go back go home page	

*/

public class Amazon_Scene1 extends AmazonLaunch_Close{
	
	@Test(priority = 1)
	public void scene1() {
		
	WebElement Searchfld = driver.findElement(By.id("small-searchterms"));	
	Searchfld.sendKeys("Shoe");
	Searchfld.sendKeys(Keys.ENTER);
	
	WebElement FirstShoe = driver.findElement(By.xpath("(//div[@class = 'picture'])/a/img"));
	FirstShoe.click();
	
	
	WebElement ShoeValidate = driver.findElement(By.className("product-name"));
	
	if(ShoeValidate.isDisplayed()) {
		Assert.assertEquals(ShoeValidate.isDisplayed(), true, "Required page is not opened");
		System.out.println("Executed Successfully");
		}
	else {
		
		System.out.println("Something went wrong!");
	}
	
	
	}
	
	

}
