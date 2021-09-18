package pageObjectModel;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ViewLeadPage extends projectSpecificMethods {
	public ViewLeadPage verifyViewLead()
	{
		boolean verifydisplay=driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
		Assert.assertTrue(verifydisplay);
		
		return this;

	}

}
