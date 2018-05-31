package com.unified.driessen.ApplicationLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class SeleniumPageObjectModelPageClass {
	
	WebDriver driver;
	
	public SeleniumPageObjectModelPageClass(WebDriver driver){
		
		this.driver=driver;
	}

	@FindBy(id="id_001")
	WebElement userName;
	
	@FindBy(how=How.ID, using="username")
	WebElement username1;
	
}
