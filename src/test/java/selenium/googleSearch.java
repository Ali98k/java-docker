package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {
	
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\uddin\\sel2\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com");
//	WebElement elm=driver.findElement(By.xpath("//input[@type='text']"));
//	elm.sendKeys("fasih");
//	elm.sendKeys(Keys.ENTER);
//	JavascriptExecutor fx=(JavascriptExecutor)driver;
//	fx.executeScript("window.scrollBy(0,1000)","");
//	driver.navigate().to("https://Amazon.com");
//   WebElement el=driver.findElement(By.xpath("//img[contains(@src,'Pride')]"));
////	WebElement el=driver.findElement(By.xpath("//img[starts-with(@alt,'Celebrate with Pride')]"));
////	WebElement el=driver.findElement(By.xpath("//img[@alt='Celebrate with Pride']"));
//	 // WebElement el=driver.findElement(By.xpath("//*[text()='Celebrate with Pride']"));
//	el.click();
	Thread.sleep(2000);
	driver.close();
	
	
}
}
