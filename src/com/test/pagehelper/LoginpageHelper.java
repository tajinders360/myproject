package com.test.pagehelper;
import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import com.test.util.DriverHelper;
import com.test.util.PropertyReader;
import com.test.locators.LocatorReader;


public class LoginpageHelper extends DriverHelper {

	LocatorReader loginpageloactor;
	PropertyReader propertyReader = new PropertyReader();



	public LoginpageHelper(WebDriver webdriver) {
		super(webdriver);

		loginpageloactor= new LocatorReader("Login.xml");	
	}

	public void clickOnLoginButton() throws InterruptedException {

		String myaccountLocator= loginpageloactor.getLocator("Login.myaccount");
		clickOn(myaccountLocator);

		String loginLocator= loginpageloactor.getLocator("Login.login");
		clickOn(loginLocator);


		String userName=propertyReader.readApplicationFile("UserName");
		String emailLocator=loginpageloactor.getLocator("Login.email");
		sendKeys(emailLocator, userName);


		String password=propertyReader.readApplicationFile("Password");
		String passwordLocator=loginpageloactor.getLocator("Login.password");
		sendKeys(passwordLocator, password);

		String loginbuttonLocator= loginpageloactor.getLocator("Login.loginbutton");
		clickOn(loginbuttonLocator);

		Thread.sleep(6000);
		String verifyTitle= loginpageloactor.getLocator("Login.verifytitle");
		verifyTitle(verifyTitle);

	}


	public void clickOnLogoutButton() throws InterruptedException  {

		String myaccountLocator= loginpageloactor.getLocator("Logout.accountname");
		clickOn(myaccountLocator);
        
		Thread.sleep(6000);
     	String logoutLocator= loginpageloactor.getLocator("Logout.logout");
		clickOn(logoutLocator);


	}



}