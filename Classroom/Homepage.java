package PageObjectParallel;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homepage extends projectSpecificMethods{
	public Homepage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
public MyHpomePage clickCrmsfa()  {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new MyHpomePage(driver);
}
}
