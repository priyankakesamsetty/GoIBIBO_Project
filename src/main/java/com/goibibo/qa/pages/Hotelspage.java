package com.goibibo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hotelspage {
	
	WebDriver driver;
	
	public Hotelspage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	

}
