package com.test.pagehelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.test.util.DriverHelper;
import com.test.util.PropertyReader;
import com.test.locators.LocatorReader;


public class HomePageHelper extends DriverHelper {

	LocatorReader loginpageloactor;
	LocatorReader homepageloactor;
	PropertyReader propertyReader = new PropertyReader();



	public HomePageHelper(WebDriver webdriver) {
		super(webdriver);

		loginpageloactor= new LocatorReader("Login.xml");	
		homepageloactor= new LocatorReader("HomePage.xml");	

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

		String verifyTitle= loginpageloactor.getLocator("Login.verifytitle");
		verifyTitle(verifyTitle);

	}


	public void searchHotels()
	{

		String homemenuLocator= homepageloactor.getLocator("Dashboard.home");
		clickOn(homemenuLocator);

		String location= homepageloactor.getLocator("Hotels.location");
		clickOn(location);

		String locationCity= homepageloactor.getLocator("Hotels.locationcity");
		sendKeys(locationCity, "New Delhi");

		String locationName= homepageloactor.getLocator("Hotels.locationname");
		clickOn(locationName);

		String checkinDate= homepageloactor.getLocator("Hotels.checkindate");
		clickOn(checkinDate);
		sendKeys(checkinDate, currentDate());
		System.out.println(currentDate());

		String checkoutDate= homepageloactor.getLocator("Hotels.checkoutdate");
		clickOn(checkoutDate);
		sendKeys(checkoutDate, getNextDate(currentDate()));
		System.out.println(getNextDate(currentDate()));

		String selectAdult= homepageloactor.getLocator("Hotels.selectadults");
		selectDropDown(selectAdult, "1");

		String selectChild= homepageloactor.getLocator("Hotels.selectchild");
		selectDropDown(selectChild, "1");

		String searchButton= homepageloactor.getLocator("Hotels.searchbutton");
		clickOn(searchButton);




	}

























	public void clickOnLogoutButton()  {

		String myaccountLocator= loginpageloactor.getLocator("Logout.accountname");
		clickOn(myaccountLocator);

		String loginLocator= loginpageloactor.getLocator("Logout.logout");
		clickOn(loginLocator);


	}



}