package PageObjectParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ViewLeadPage extends projectSpecificMethods {
	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public ViewLeadPage verifyViewLead()
	{
		boolean verifydisplay=driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
		Assert.assertTrue(verifydisplay);
		
		return this;

	}

}
