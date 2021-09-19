package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPropertiesFile {
	public static void main(String[] args) throws IOException {
	
		FileInputStream fis=new FileInputStream("./src/main/resources/Config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));

		System.out.println(prop.getProperty("username"));

		System.out.println(prop.getProperty("password"));

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webuser = driver.findElement(By.id("username"));
		webuser.sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rani");
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");
		driver.findElement(By.className("smallSubmit")).click();
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String replaceall=text.replaceAll("\\D", "");
		FileOutputStream fos=new FileOutputStream("./src/main/resources/Config.properties");
				prop.setProperty("leadId", replaceall);
		
		prop.store(fos, null);

		
	}

}
