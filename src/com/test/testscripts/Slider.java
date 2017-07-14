package com.test.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Slider {


	@Test
	public void slider() throws InterruptedException
	{

		WebDriver driver = null;


		String DriverPath="E:\\Tajinder\\Selenium\\Test\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",DriverPath);
		driver= new ChromeDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();

		WebElement frames = driver.findElement(By.xpath("//li[@id='menu-item-148']/a"));
		//WebElement frmaes = driver.findElement(By.xpath("//div[@id='slider-range-max']/span"));
		frames.click();
		WebElement framesset = driver.findElement(By.xpath("//a[@id='ui-id-3']"));
		framesset.click();
		WebElement frmaelink = driver.findElement(By.xpath("//div[@id='tabs-3']/div/p/a"));
		frmaelink.click();
/*		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);

		for (String handle1 : driver.getWindowHandles())
		{
			System.out.println(handle1);
			driver.switchTo().window(handle1);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
		}
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='topFrame']")));
		Assert.assertEquals("www.toolsqa.com", "www.toolsqa.com");

		//Closing Pop Up window
		driver.close();*/
		
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		  		  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='topFrame']")));
		          Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'tool')]")).isDisplayed());
		          driver.close(); //closing child window
		          driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
		




	}
}
