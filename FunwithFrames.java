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

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunwithFrames {
	public static void main(String[] args) throws InterruptedException, IOException {

	WebDriverManager.chromedriver().setup();

	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement frame1= driver.findElement(By.xpath("//div[@id='wrapframe'][1]/iframe"));
	driver.switchTo().frame(frame1);
	Thread.sleep(3000);
	WebElement screenShot=driver.findElementById("Click");
	File source = screenShot.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snap/button.png");
	FileUtils.copyFile(source, dest);
	Thread.sleep(5000);
	screenShot.click();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();

	WebElement nestedFrame2 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[2]/iframe"));
	driver.switchTo().frame(nestedFrame2);
	Thread.sleep(5000);
	driver.switchTo().frame("frame2");
	Thread.sleep(5000);
	driver.findElementById("Click1").click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	WebElement nestedFrame3 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[3]/iframe"));
	driver.switchTo().frame(nestedFrame3);
	driver.switchTo().frame("frame2");
	List<WebElement> numberofFrames = driver.findElementsByTagName("iframe");
	int size = numberofFrames.size();
	System.out.println("Number of iframes in the 3rd nested iframe is: "+size);
	driver.switchTo().defaultContent();
	List<WebElement> numberofFrames1 = driver.findElementsByTagName("iframe");
	int size1 = numberofFrames1.size();
	System.out.println("Number of iframes in the main page is: "+size1);

}
