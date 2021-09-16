package steps;

public class DuplicateStepDefinition extends BaseClass {
	@Given("Click on DuplicateLead")
	public void clickDuplicateLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Given("Click on submit after DuplicateLead")
	public void submitAftDuplicateLead() {
		driver.findElement(By.name("submitButton")).click();
	

}
