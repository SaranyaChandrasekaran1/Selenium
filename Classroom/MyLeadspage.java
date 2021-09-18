package PageObjectParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeadspage extends projectSpecificMethods  {
	
	public MyLeadspage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public CreateLead clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	    return new CreateLead(driver);
	}
	
}
