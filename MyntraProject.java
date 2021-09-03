package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraProject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement webMen=driver.findElement(By.xpath("//a[text()='Men']"));
		Actions builder= new Actions(driver);
		builder.moveToElement(webMen).perform();
		
	driver.findElement(By.xpath("//a[text()='Jackets']")).click();
	String totalItems = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
	System.out.println("Total number of Jackets : " + totalItems);
	String replaceall=totalItems.replaceAll("[^0-9]","");
	int parseInt= Integer.parseInt(replaceall);
	
String Jackets=driver.findElement(By.xpath("//span[@class='categories-num']")).getText();
System.out.println(Jackets);
String replaceall1=Jackets.replaceAll("[^0-9]","");
int parseInt1= Integer.parseInt(replaceall1);

String RainJacket=driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']")).getText();
System.out.println(RainJacket);

String replaceall2=RainJacket.replaceAll("[^0-9]","");
int parseInt2= Integer.parseInt(replaceall2);
int sum=parseInt1+parseInt2;
if(parseInt==sum)
{
	System.out.println("Matches");
}
else
{
	System.out.println("Does not Match");
}
driver.findElement(By.xpath("//label[contains(text(),'Jackets')]")).click();
driver.findElement(By.xpath("//div[@class='brand-more']")).click();
driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
driver.findElement(By.xpath("//label[contains(text(),'Duke')]")).click();
driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
List<WebElement>Brand= driver.findElements(By.className("product-brand"));

List<String> BrandName=new ArrayList<String>();
for(int i=0;i<Brand.size();i++)
{
	WebElement element=Brand.get(i);
	String textBrandName=element.getText();
	BrandName.add(textBrandName);
	}
	for(String WebElement2:BrandName)
	{
		if(BrandName.contains("Duke"))
		{
			System.out.println("This is a Duke Product");
		}
		else
		{
			System.out.println("This is not a Duke Product");
		}
	}
	
	WebElement SortBy=driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
	builder.moveToElement(SortBy).perform();
	driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
	String FirstProductPrice= driver.findElement(By.xpath("//div[@class='product-price']")).getText();
	System.out.println("The Price of First Product:"+FirstProductPrice);
	
	WebElement Screenshot=driver.findElement(By.xpath("//div[@class='product-imageSliderContainer']"));
	File src1=Screenshot.getScreenshotAs(OutputType.FILE);
	File dst=new File("./snap/Myntra.png");
	FileUtils.copyFile(src1, dst);
	
	Set<String> WindowHandlesSet=driver.getWindowHandles();
	List<String> WindowHandleList=new ArrayList<String>(WindowHandlesSet);
	WindowHandleList.get(1);
	driver.findElement(By.xpath("//span[@class='desktop-userTitle']")).click();
	driver.close();
	 
	
	}
}