package testCase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.MyntraHome;

public class MyntraAddToCart extends BaseClass{

	
	@Test
	public void addcart() throws TimeoutException
	{
		
		logger.info("this test case started");
		MyntraHome my=new MyntraHome(driver);
	    my.menu();
	    my.swet();
	    my.addcart();
	    
	   String window= new ArrayList<String>(driver.getWindowHandles()).get(1);
	   //String sname=my.swetname();
	   //System.out.println(sname);
	  List<WebElement> button= driver.findElements(By.className("size-buttons-size-button"));
	  for(WebElement b:button)
	  {
		  b.click();
	  }
	  
	   my.addcart();
       my.gotocart();
		
	}
}
