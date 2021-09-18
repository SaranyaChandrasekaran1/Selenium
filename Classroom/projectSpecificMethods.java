package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projectSpecificMethods {
	public static ChromeDriver driver;
	@BeforeMethod
   public void precondition() {
	  WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  }
   @AfterMethod
  public void postcondition() {
		driver.close();

}
}
