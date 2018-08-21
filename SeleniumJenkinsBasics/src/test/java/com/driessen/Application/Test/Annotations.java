package com.driessen.Application.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Annotations {
	

	/*@Test(groups="test")
	@Parameters({"uname","pword"})
	public void testsetup(@Optional String uname,String pword) throws InterruptedException{

		//System.setProperty("webdriver.firefox.marionette", "D:\\SW\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//DesiredCapabilities cap=DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
		//WebDriver driver=new FirefoxDriver();
		
		//driver.get("https://test-mijn.driessen.nl/");
		System.out.println("inisde first methods"+uname);
		//driver.close();
		
	}*/
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside before suite");
	}
	
	@BeforeGroups
	public void beforeGroup() {
		System.out.println("inside before group");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("inside before Test");
	}
	
	@org.testng.annotations.BeforeClass
	public void beforeClass() {
		System.out.println("inside before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inside before method");
	}
	
	
	

	@Test
	public void testsetup1() {

		//System.setProperty("webdriver.chrome.driver", "D:\\SW\\chromedriver_win32\\chromedriver.exe");
		//DesiredCapabilities cap=DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("http://www.seleniumeasy.com/selenium-tutorials/how-to-run-webdriver-in-ie-browser");
		System.out.println("inside second thread");
		//driver.quit();
		
	}
	

	@Test(groups="test")
	public void testsetup2() {

		//System.setProperty("webdriver.chrome.driver", "D:\\SW\\chromedriver_win32\\chromedriver.exe");
		//DesiredCapabilities cap=DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("http://www.seleniumeasy.com/selenium-tutorials/how-to-run-webdriver-in-ie-browser");
		System.out.println("inside third thread");
		//driver.quit();
		
	}
}
