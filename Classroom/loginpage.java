package PageObjectParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage extends projectSpecificMethods {
	
	public loginpage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public loginpage enterusername()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	return this;
	}
public loginpage enterpassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
return this;
}
public Homepage clickLoginButton()
{
	driver.findElement(By.className("decorativeSubmit")).click();
	return new Homepage(driver);
	 

}
}
