package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateStepDefinition extends BaseClass {
	
	@When("Click on Create Lead button")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
		
	
	@Given("Enter company name as {string}")
public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@Given("Enter firstname as {string}")
public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	@Given("Enter lastname as {string}")
public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@Given("Enter phone number as {string}")
public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Given("Click on submit button")
	public void clickSubmitButton() {
			
			driver.findElement(By.name("submitButton")).click();
		}
			}


