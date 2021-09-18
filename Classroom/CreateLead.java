package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateLead extends projectSpecificMethods {
	
	
	
	public CreateLead entercompanyName() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	return this;
	}
	public CreateLead enterfirstName() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raja");
	return this;
	}
	public CreateLead enterlastName() {

	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rani");
	return this;
	}
	public CreateLead enterPhoneCountryCode()
	{
	 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("5");
	 return this;
	}
	public ViewLeadPage clickSubmitButton() {
	driver.findElement(By.className("smallSubmit")).click();
return new ViewLeadPage();
	}

}
