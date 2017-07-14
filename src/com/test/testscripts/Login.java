package com.test.testscripts;

import com.test.pagehelper.LoginpageHelper;
import com.test.util.DriverTestCase;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login extends DriverTestCase{	
	@Test
	public void testLogin_Logout() throws InterruptedException, AWTException, IOException
	{
		try{

	    //Initialize objects for different pages.
        LoginpageHelper loginpagehelper= new LoginpageHelper(getWebDriver());
		
		//Click on login button and verify the title
		loginpagehelper.clickOnLoginButton();
		
		//Click on logout 
		loginpagehelper.clickOnLogoutButton();
		
		}
		catch(Exception e)
		{

		}
	}


  




	

}