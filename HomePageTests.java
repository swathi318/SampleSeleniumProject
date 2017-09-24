package com.POMway2Automation.web.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.POMway2Automation.web.utils.TestInitializer;

public class HomePageTests {
	TestInitializer startTest=new TestInitializer();
	@Test
	public void Homepage_Test_1()
	{
		//TestInitializer startTest=new TestInitializer();
		WebDriver driver=startTest.initiateChromeDriver();
	
	startTest.closeDriver(driver);	
	}
@Test
public void Homepage_Test_2()
{	System.setProperty("webdriver.gecko.driver","C:\\Swapna\\Geckodriver\\geckodriver.exe");
	WebDriver driver=startTest.initiateFirefoxDriver();
	startTest.closeDriver(driver);
}
}
