package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElementByLinkText("Contacts").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Merge Contacts']").click();
		driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(2000);
		driver.switchTo().window(windowHandlesList.get(0));
driver.findElement(By.xpath("//table[@widgetid='ComboBox_partyIdTo']/following-sibling::a")).click();
Set<String> windowHandles1 = driver.getWindowHandles();
List<String> windowHandlesList1 = new ArrayList<String>(windowHandles1);
driver.switchTo().window(windowHandlesList1.get(1));

driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
driver.switchTo().window(windowHandlesList.get(0));

driver.findElementByLinkText("Merge").click();
driver.switchTo().alert().accept();
Thread.sleep(3000);
String title=driver.getTitle();
if(title.contains("viewContact"))
{
	System.out.println("Merged successfully");
	}
	else
		System.out.println("Merge failed");
}
}

