package PageObjectParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyHpomePage extends projectSpecificMethods{
	public MyHpomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyLeadspage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadspage(driver);
	} 

}
