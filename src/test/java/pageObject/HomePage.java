package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasaPage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//header[@id='desktop-header-cnt']//a[text()='Men']))") WebElement frontend;
	@FindBy(xpath="//span[text()='My Account']") 
	WebElement My_account;
	
	@FindBy(xpath="//a[text()='Register']") 
	WebElement Register;
	
	
	
	public void frontend()
	{
		frontend.click();	
	}
	
     public void clickaccount()
     {
    	 My_account.click();
     }
     
     public void clickregi()
     {
    	 Register.click();
     }
}
