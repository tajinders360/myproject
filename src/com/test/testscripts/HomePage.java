package com.test.testscripts;

import com.test.pagehelper.LoginpageHelper;
import com.test.pagehelper.HomePageHelper;

import com.test.util.DriverTestCase;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HomePage extends DriverTestCase{	
	@Test
	public void Search_Hotels() throws InterruptedException, AWTException, IOException
	{
		//Initialize objects for different pages.
        LoginpageHelper loginpagehelper= new LoginpageHelper(getWebDriver());
        HomePageHelper homepagehelper= new HomePageHelper(getWebDriver());
        
		//Click on login button and verify the title
		loginpagehelper.clickOnLoginButton();

		//Search the hotels
		homepagehelper.searchHotels();
		
		//Click on logout 
		loginpagehelper.clickOnLogoutButton();

	}


}