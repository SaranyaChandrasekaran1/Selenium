package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Mouse hover on Testleaf courses and print all the links
		WebElement Element = driver.findElementByLinkText("TestLeaf Courses");
		Actions builder = new Actions(driver);
		builder.moveToElement(Element).perform();
		List<WebElement> LinksElement = driver.findElementsByClassName("listener");
		System.out.println("Number of links:" + LinksElement.size());
		for (WebElement webelement : LinksElement) {
			System.out.println("Names of the course:" + webelement.getText());
		}
		//Mouse hover on Testleaf courses and click any course and handle the alert
		builder.moveToElement(Element).perform();
		driver.findElement(By.xpath("//a[text()='RPA']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

		



	}

}
