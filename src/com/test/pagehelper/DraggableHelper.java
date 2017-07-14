package com.test.pagehelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.test.locators.LocatorReader;
import com.test.util.DriverHelper;

public class DraggableHelper extends DriverHelper {

	LocatorReader draggablepageloactor;


	public DraggableHelper(WebDriver webdriver) {
		super(webdriver);

		draggablepageloactor= new LocatorReader("Draggable.xml"); 
	}

	public void Draggable()
	{
		String draggable= draggablepageloactor.getLocator("Draggable.draggableicon");
		clickOn(draggable);
		String dragmethere= draggablepageloactor.getLocator("Draggable.dragmethere");
     	dragElement(dragmethere);
		System.out.println(dragmethere);
	}

	public void Draganddrop()
	{

		//String draggable= draggablepageloactor.getLocator("Draggable.draggableicon");
		//clickOn(draggable);

		//String constraintTab= draggablepageloactor.getLocator("Draggable.constrainttab");
		//clickOn(constraintTab); 
			
		
		String droppable= draggablepageloactor.getLocator("Draggable.droppable");
		clickOn(droppable);
		String soruce= draggablepageloactor.getLocator("Draggable.draggableview");
		String destination= draggablepageloactor.getLocator("Draggable.droppableview");
		testDragAndDropExample(soruce,destination );


	}
	
	
	public void Accordion()
	{
		
		clickOn(draggablepageloactor.getLocator("Accordion.accordion"));

		String select1=draggablepageloactor.getLocator("Accordion.section1");
		String Actual= getText(select1);
		Assert.assertTrue(Actual.contains("Mauris mauris ante"));
		
		clickOn(draggablepageloactor.getLocator("Accordion.section2link"));
		String select2=draggablepageloactor.getLocator("Accordion.section2");
		String Actual2= getText(select2);
		Assert.assertTrue(Actual2.contains("Sed non urna."));

	
		clickOn(draggablepageloactor.getLocator("Accordion.section3link"));
		String select3=draggablepageloactor.getLocator("Accordion.section3");
		String Actual3= getText(select3);
		Assert.assertTrue(Actual3.contains("Nam enim risus,"));


		clickOn(draggablepageloactor.getLocator("Accordion.section4link"));
		String select4=draggablepageloactor.getLocator("Accordion.section4");
		String Actual4= getText(select4);
		Assert.assertTrue(Actual4.contains("Cras dictum."));
	}
}