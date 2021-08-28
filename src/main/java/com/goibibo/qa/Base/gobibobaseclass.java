package com.goibibo.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class gobibobaseclass {

	static WebDriver driver;
	static Properties prop;



	public gobibobaseclass()
	{
	try {

		prop = new Properties();
		

			FileInputStream IP = new FileInputStream(System.getProperty("userdir" + "/com.goibibo/src/main/java/" +"com/goibibo/qa/config/config.properties" ));
			prop.load(IP);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void browser_setup()
	{
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")){
			driver= new ChromeDriver();
			
		}
		
		driver.get(prop.getProperty("url"));
		
	}


}
