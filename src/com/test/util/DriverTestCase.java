package com.test.util;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public abstract class DriverTestCase 
{

	//public LoginHelper loginHelper;
	String DriverPath;

	enum DriverType 
	{ Firefox, IE, Chrome }

	//Define objects
	private WebDriver driver;
	public WebDriverWait wait;

	//Initialize objects
	protected PropertyReader propertyReader = new PropertyReader();
    

	@BeforeTest
	public void setUp() 
	{  
		String driverType = propertyReader.readApplicationFile("BROWSER");  

		if (DriverType.Firefox.toString().equals(driverType)) 
		{ 
			
			DriverPath= getFilePath() + File.separator + File.separator +"Drivers" + File.separator + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",DriverPath);
			driver = new FirefoxDriver();
		}   

		else if (DriverType.IE.toString().equals(driverType)) 
		{ 
			DriverPath= getFilePath() + File.separator + File.separator +"Drivers" + File.separator + "IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",DriverPath);
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);   
			driver = new InternetExplorerDriver(capabilities); 
		}
		else if (DriverType.Chrome.toString().equals(driverType)) 
		{ 
			DriverPath= getFilePath() + File.separator + File.separator +"Drivers" + File.separator + "chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",DriverPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options); } 
		else 
		{
			System.setProperty("webdriver.gecko.driver",DriverPath);
			driver = new FirefoxDriver(); }   

		//Launch the URL
		String url = propertyReader.readApplicationFile("WebURL1");
		driver.navigate().to(url);

		//Maximize window
		driver.manage().window().maximize();

		//Delete cookies
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 100);
		
		//loginHelper = new LoginHelper(driver);

	} 

	@AfterSuite
	public void afterMainMethod() 
	{  
		//driver.quit();
	}

	public WebDriver getWebDriver()
	{
		return driver;
	}

	//Get absolute path
	public String getFilePath()
	{
		String filepath ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		filepath = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
		return filepath;
	}
}