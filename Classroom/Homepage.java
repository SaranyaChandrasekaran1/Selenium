package pageObjectModel;
import org.openqa.selenium.By;


public class Homepage extends projectSpecificMethods{
	
public MyHpomePage clickCrmsfa()  {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new MyHpomePage();
}
}
