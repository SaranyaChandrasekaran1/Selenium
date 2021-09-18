package pageObjectModel;

import org.openqa.selenium.By;

public class MyLeadspage extends projectSpecificMethods  {
	public CreateLead clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	    return new CreateLead();
	}
	
}
