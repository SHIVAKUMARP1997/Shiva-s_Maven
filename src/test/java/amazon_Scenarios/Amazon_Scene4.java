package amazon_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//4. serach mobile cover->Include Out of Stock checkbox	

public class Amazon_Scene4 extends AmazonLaunch_Close{

	@Test(priority=4)
	public void Scene4() {
	
	
	WebElement Searchfld = driver.findElement(By.id("small-searchterms"));	
	Searchfld.sendKeys("Shoe");
	Searchfld.sendKeys(Keys.ENTER);
	
	
	
	}
}
