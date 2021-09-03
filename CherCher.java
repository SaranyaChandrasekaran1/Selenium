package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCher {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("frame1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Not a Friendly Topic");
		Thread.sleep(5000);
		driver.switchTo().frame("frame3");
		WebElement element = driver.findElement(By.id("a"));
		element.click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("frame2");
		WebElement drop1 = driver.findElement(By.id("animals"));
		Select drpDwn = new Select(drop1);
		drpDwn.selectByIndex(2);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);

	}

}
