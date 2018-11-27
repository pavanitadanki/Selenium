package com.qa.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utility.DriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
	public static WebDriver driver;
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	String appUrl = "https://login.salesforce.com/?locale=au";
	public static final String CHROME_DRIVER_PATH = PROJECT_PATH + "//drivers//chromedriver.exe";

	@Before(order = 0)
	public void setUpDriver() {
		System.out.println("start-Before cucumber hooks");
		driver = DriverManager.getDriver("Chrome");
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("end-Before cucumber hooks");
	}

	@Before(order = 1)
	public void dbConnection() {
		System.out.println("DBConnection");
	}

	@Before(order = 2)
	public void serverConnection() {
		System.out.println("ServerConnection");
	}

	@After(order = 0)
	public void closeDriver() {
		System.out.println("start-After cucumber hooks");
		driver.quit();
		System.out.println("end-After cucumber hooks");
	}

	@After(order = 1)
	public void closeDBConnection() {
		System.out.println("CloseDBConnection");
	}

	@After(order = 2)
	public void closeServerConnection() {
		System.out.println("CloseServerConnection");
	}

}
