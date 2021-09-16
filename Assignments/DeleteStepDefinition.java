package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class DeleteStepDefinition extends BaseClass{
	String leadID ;
	@Given("Click on leadID")
	public void clickLeadID() throws InterruptedException {
		Thread.sleep(2000);
		leadID=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@Given("Click on Delete")
	public void clickOnDelete() {
	driver.findElement(By.linkText("Delete")).click();
	}
	
	@Given("Enter the leadID")
	public void enterLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		}
	
	@Given("Verify Lead ID")
	public void verifyLeadId() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		}

}
