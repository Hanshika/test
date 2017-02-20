
package com.whitebox;

import static org.testng.AssertJUnit.assertTrue;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;



import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewTest {
	
  @Test
  
  public void f() {
	  

	 //System.setProperty("webdriver.gecko.driver",LOCATION+ "H:\\Users\\Hanshika\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	  WebDriver driver = new ChromeDriver();
     
		 driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getTitle().contains("facebook"));
	//	hiii
  }


	
}
  

