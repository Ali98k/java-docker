package selenium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserTest {

	static AppiumDriver <MobileElement>driver;
	public static void main(String[] args) throws Exception {
		
	DesiredCapabilities cap=new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel api 25");
	cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
	//cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
//	cap.setCapability("deviceName","pixel_api_25");
//	cap.setCapability("udid","emulator-5554");
//	cap.setCapability("plateformName","Android");
//	cap.setCapability("plateformVersion","7.1.1");
//	//cap.setCapability(capabilityName, value);
	cap.setCapability("appPackage","com.android.calculator2");
	cap.setCapability("appActivity","com.android.calculator2.Calculator");
      URL url= new URL("http://127.0.0.1:4723/wd/hub");
	driver= new AppiumDriver<MobileElement>(url,cap);
//	driver=new AndroidDriver<MobileElement>(url,cap);
//	driver=new IOSDriver<MobileElement>(url,cap); 
	System.out.println("application started....");
	MobileElement seven=driver.findElement(By.id("com.android.calculator2:id/digit_7"));
	MobileElement mul=driver.findElement(By.id("com.android.calculator2:id/op_mul"));
	MobileElement five=driver.findElement(By.id("com.android.calculator2:id/digit_5"));
	MobileElement eq=driver.findElement(By.id("com.android.calculator2:id/eq"));
	MobileElement res=driver.findElement(By.id("com.android.calculator2:id/result"));
	seven.click();
	mul.click();
	five.click();
	eq.click();
	System.out.println("expected result 35: ");
	String res1=res.getText();
	System.out.println(res1);
	
	
}
 

}
