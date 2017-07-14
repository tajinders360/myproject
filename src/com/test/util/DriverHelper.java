package com.test.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public abstract class DriverHelper
{
	// Define objects

	protected WebDriver driver;

	// Declare objects
	public DriverHelper(WebDriver webdriver)
	{
		driver = webdriver;
	}

	// Return web driver object
	public WebDriver getWebDriver() 
	{
		return driver;  
	}

	// Print message on screen
	public void log(String logMsg) 
	{
		System.out.println(logMsg);
	}

	// Handle locator type
	public By byLocator(String locator) 
	{
		By result = null;

		if (locator.startsWith("//")) 
		{
			result = By.xpath(locator);
		} 
		else if (locator.startsWith("css=")) 
		{
			result = By.cssSelector(locator.replace("css=", ""));
		} 
		else if (locator.startsWith("#")) 
		{
			result = By.name(locator.replace("#", ""));
		} 
		else if (locator.startsWith("link=")) 
		{
			result = By.linkText(locator.replace("link=", ""));
		} 
		else {
			result = By.id(locator.replace("id=", ""));
		}
		return result;
	}

	// Assert element present
	public Boolean isElementPresent(String locator) 
	{
		Boolean result = false;
		try 
		{
			getWebDriver().findElement(byLocator(locator));
			result = true;
		} 
		catch (Exception ex) 
		{
		}
		return result;
	}

	// Wait for element present
	public void waitForElementPresent(String locator, int timeout) 
	{
		for (int i = 0; i < timeout; i++) 
		{
			if (isElementPresent(locator)) 
			{
				break;
			}

			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}


	// Handle click action
	public void clickOn(String locator) 
	{
		this.waitForElementPresent(locator, 30);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		WebElement el = getWebDriver().findElement(byLocator(locator));
		el.click();
	}

	// Handle send keys action
	public void sendKeys(String locator, String  str) 
	{
		this.waitForElementPresent(locator, 30);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :" + locator + " Not found");
		WebElement el = getWebDriver().findElement(byLocator(locator));
		el.clear();
		el.sendKeys(str);
	}

	// Store text from a locatorl
	public String getText(String locator) {
		waitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		String text = getWebDriver().findElement(byLocator(locator)).getText();
		return text;
	}

	// Get attribute value
	public String getAttribute(String locator, String attribute) 
	{
		waitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		String text = getWebDriver().findElement(byLocator(locator))
				.getAttribute(attribute);
		return text;
	}

	public Integer getXpathCount(String locator)
	{
		waitForElementPresent(locator, 30);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		int a = driver.findElements(By.xpath(locator)).size();
		return a;
	}

	public void waitForWorkAroundTime(int timeout)
	{
		try 
		{
			Thread.sleep(timeout);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	public void verifyTitle(String title)
	{
		String actualTitle=getWebDriver().getTitle();
		Assert.assertTrue(actualTitle.contains(title));
	}
	
	public void mouseHover(String locator)
	{
        WebElement el = getWebDriver().findElement(By.xpath(locator));
        Actions builder = new Actions(getWebDriver());
        builder.moveToElement(el).build().perform();
	}
	
	public void moveMouse(int x,int y) throws AWTException
	{
		Robot rb = new Robot();
		waitForWorkAroundTime(1000);
		rb.mouseMove(x, y);
		waitForWorkAroundTime(1000);
	}
	
	public int getElementSize(String locator)
	{
		return getWebDriver().findElements(By.xpath(locator)).size();
	}
	
	//wait for page load
	public void waitForPageLoad()
	{
		waitForWorkAroundTime(10000);
	}
	
	
	//Current Date
	public static String currentDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
		
	}
	
	//To get next day date
	 public static String getNextDate(String curDate) {
	        String nextDate = "";
	        try {
	            Calendar today = Calendar.getInstance();
	            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	            Date date = format.parse(curDate);
	            today.setTime(date);
	            today.add(Calendar.DAY_OF_YEAR, 2);
	            nextDate = format.format(today.getTime());
	        } catch (Exception e) {
	            return nextDate;
	        }
	        return nextDate;
	    }
	
	
	
	// To select value from the drop down
	public void selectDropDown(String locator, String targetValue) {
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		this.waitForElementPresent(locator, 20);
		new Select(getWebDriver().findElement(byLocator(locator)))
				.selectByVisibleText(targetValue);

	}
	
	//To drag the elements by offset
	
	public void dragElement(String locator)
	{
		
		 new Actions(driver).dragAndDropBy(getWebDriver().findElement(byLocator(locator)), 200, 200).build() .perform();

	}
	
	
	//To drag and drop the elements
	
	
	public void testDragAndDropExample(String locator, String locator1) {
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(getWebDriver().findElement(byLocator(locator)), getWebDriver().findElement(byLocator(locator1))).build().perform();
	
		
	}
	
	
	
	
	
	
	
}