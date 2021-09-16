package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class EditStepDefinition extends BaseClass{
@Given("Click on Lead")
	
	public void lead() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@Given("Click on Find Lead") 
	public void findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given("Enter phone number in findLead as {string}")
	public void enterPhoneNum(String phNo) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
	}
	
	@Given("Click on Find Lead button")
	public void clickFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Given("Click on Edit")
	
	public void clickOnEdit() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Update company name as {string}")
	public void updateCompantName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}
	
	@Given("Click on submit After Edit")
	public void clickSubmitAftEdit() {
		driver.findElement(By.className("smallSubmit")).click();
	}
}
