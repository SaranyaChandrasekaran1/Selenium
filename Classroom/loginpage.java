package pageObjectModel;

import org.openqa.selenium.By;

public class loginpage extends projectSpecificMethods {
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
	return new Homepage();
	 

}
}
