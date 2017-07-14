package com.test.testscripts;

import com.test.pagehelper.DraggableHelper;
import com.test.util.DriverTestCase;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Draggable extends DriverTestCase{	
	@Test
	public void Drag_box() throws InterruptedException, AWTException, IOException
	{
		try{

			//Initialize objects for different pages.
			DraggableHelper draghelper= new DraggableHelper(getWebDriver());


			//draghelper.Draggable();

			// draghelper.Draganddrop();

			draghelper.Accordion();


		}
		catch(Exception e)
		{

		}
	}









}