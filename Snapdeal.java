package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(" https://www.snapdeal.com/");
		WebElement webMen=driver.findElement(By.xpath("(//span[@class='catText'])[6]"));
		Actions builder= new Actions(driver);
		builder.moveToElement(webMen).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String Count=driver.findElement(By.xpath("//span[@class='category-count']")).getText();
		System.out.println("Sports Shoes Count:"+Count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		WebElement SortBy=driver.findElement(By.xpath("//span[text()='Sort by:']"));
		SortBy.click();
		Thread.sleep(3000);
		WebElement LowtoHigh=driver.findElement(By.xpath("//li[@class='search-li']"));
		LowtoHigh.click();
		if(SortBy.equals(LowtoHigh))
		{
			System.out.println("The items displayed are not sorted correctly");
		}
		else
		{
			System.out.println("The items displayed are  sorted correctly");
		
		}
        		
		WebElement Hover=driver.findElement(By.xpath("//p[text()='JAGROON RUNNER Green Training Shoes']"));
		Actions builder1=new Actions(driver);
		builder1.moveToElement(Hover).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		
		
		
	}
}
