package pageObjectModel;

import org.openqa.selenium.By;

public class MyHpomePage extends projectSpecificMethods{
	public MyLeadspage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadspage();
	} 

}
