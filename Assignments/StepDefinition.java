package steps;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {
	

	
	//  @Given("Open the chrome browser")
	  public void openBrowser() {
	  WebDriverManager.chromedriver().setup(); 
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
	 
	  @And("Load the application url {string}") 
	  public void loadApplication(String url) {		
		  driver.get(url);
}//
	 
	  	 

	@Given("Enter the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Click on Login button")
	public void clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	
	@Then("Homepage should be displayed")
	public void verifyHomepage() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();

		if (displayed) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("not displayed");
		}
	}
	@But("Error message should be displayed")
	public void verifyErrormessage()
	{
		System.out.println("Error message should be displayed");
}
	@When("click on {string} link")
	public void clickLink(String link)
	{
		driver.findElement(By.linkText(link)).click();

	}
	@Then("{string} page should be displayed")
	public void verifyPage(String pageName)
	{
		boolean displayed =driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		if(displayed)
		{
			System.out.println(pageName+"is displayed");
		}
		else
		{
			System.out.println(pageName+"is not displayed");

		}
	}
}
	