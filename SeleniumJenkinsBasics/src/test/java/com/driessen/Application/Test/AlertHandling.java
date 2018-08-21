package com.driessen.Application.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	
	
	@Test
	public void testAlert() throws Exception {
		
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
			Thread.sleep(3000);
			
			// //*[contains(text(),'Dubai')]
			//driver.findElement(By.xpath("//*[contains(text(),'Dubai')]")).click();
			
			List<WebElement> Cities=driver.findElements(By.xpath("//div//span[@class='autoCompleteItem__cntry']"));
			//Iterator<WebElement> iter=cities.iterator();
			
			System.out.println("total elements: "+Cities.size());
			
			//while(iter.hasNext()){
				//WebElement ele=iter.next();
				//System.out.println("cities are : "+ ele.getText().trim());
			//}

			for(WebElement ele:Cities) {
				
				String city=ele.getText().trim();
				System.out.println("cities are : "+city);
				
				if(city.contains("BOM")) {
					ele.click();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
			Thread.sleep(3000);
			
			for(WebElement ele:Cities) {
				
				String city=ele.getText().trim();
				System.out.println("cities are : "+city);
				
				if(city.contains("BBI")) {
					ele.click();
					break;
				}
			}
		}

}
