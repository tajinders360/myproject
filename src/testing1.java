import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testing1 {

	static WebDriver driver;
	static AppiumDriver mobiledriver;

	@Test
	public static void doubleclick() throws Exception
	{


		/**
		 *
		 * For Chrome windows
		 *
		 */

		/*	String DriverPath="E:\\Tajinder\\Selenium\\Test\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",DriverPath);
		driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='free-trial-desktop hidden-sm hidden-xs']/div/div/a/span")).click();


		Set<String> AllWindowHandles = driver.getWindowHandles();
		String window1 = (String) AllWindowHandles.toArray()[0];
		System.out.print("window1 handle code = "+AllWindowHandles.toArray()[0]);
		String window2 = (String) AllWindowHandles.toArray()[1];
		System.out.print("window2 handle code = "+AllWindowHandles.toArray()[1]);
		driver.switchTo().window(window2);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='UserFirstName']")).sendKeys("testing");
		driver.close();
		driver.switchTo().window(window1);
		Thread.sleep(5000);
	    WebElement wl=driver.findElement(By.xpath("//h2[@id='discover-trailhead-the-fun-way-to-learn-salesforce']/a/span"));
		String text= wl.getText();
		System.out.println(text);
		Assert.assertEquals("DISCOVER TRAILHEAD. THE FUN WAY TO LEARN SALESFORCE.", text);
		driver.quit();
		 */

		
		/*
		 *  For mobile web
		 * 
		 */
		
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.4.13.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "FA56HY903488");
		//capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100");
		//capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("app", "E:\\Tajinder\\Selenium\\Test\\apk\\Flipkart-com.flipkart.android-780600-v5.9.apk");
		capabilities.setCapability("appPackage", "com.flipkart.android");
		mobiledriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        mobiledriver.get("https://www.google.co.in/");
		mobiledriver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Appium");
		mobiledriver.findElement(By.xpath("//button[@id='tsbb']")).click();
        WebElement text= mobiledriver.findElement(By.xpath("//a[contains(text(), 'Appium: Mobile App Automation Made Awesome.')]"));
        String Gettext=text.getText();
        Assert.assertEquals("Appium: Mobile App Automation Made Awesome.", Gettext); 
        mobiledriver.close();
		mobiledriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//WebElement frame1= mobiledriver.findElement(By.className("android.widget.FrameLayout"));
		//mobiledriver.switchTo().frame(frame1);
		//mobiledriver.switchTo().frame(frame1);
		//mobiledriver.switchTo().frame(frame1);
		mobiledriver.findElement(By.className("android.widget.ImageButton")).click();
		mobiledriver.findElement(By.className("android.widget.TextView")).sendKeys("shoes");
		mobiledriver.findElement(By.xpath("//TextView[@resource-id='com.flipkart.android:id/incorrect_login_text']")).click();
		mobiledriver.findElement(By.xpath("//TextView[contains(text(), 'Puma Exsis IDP Running Shoes')]")).click();
		mobiledriver.findElement(By.xpath("//TextView[@resource-id='com.flipkart.android:id/product_addtocart_1']")).click();
		*/


	    String DriverPath="E:\\Tajinder\\Selenium\\Test\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",DriverPath);
		driver= new ChromeDriver();
		










	}


	public String getFilePath()
	{
		String filepath ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		filepath = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
		return filepath;
	}


	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =(TakesScreenshot) webdriver;

		System.out.println(scrShot);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile=new File(fileWithPath);

		//Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}




}




