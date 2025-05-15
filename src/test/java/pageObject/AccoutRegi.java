package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccoutRegi extends BasaPage {

	public AccoutRegi(WebDriver driver) 
	{
		super(driver);
	}
	
      @FindBy(id="input-firstname") WebElement fname;
      @FindBy(id="input-lastname") WebElement last_name;
      @FindBy(name="email") WebElement email;
      @FindBy(id="input-password") WebElement password;
      @FindBy(id="input-newsletter") WebElement newsletter;
      @FindBy(name="agree") WebElement agreebutton;
      @FindBy(xpath="//button[text()='Continue']") WebElement continuebutton;
      @FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement confirmmessage;
      
      public void fristname(String fname1)
      {
    	  fname.sendKeys(fname1);
      }
         
      public void lastname(String lname)
      {
    	  last_name.sendKeys(lname);
      }
      
      public void inputemail(String emaill)
      {
    	  email.sendKeys(emaill);
      }
      public void inputpass(String pass)
      {
    	  password.sendKeys(pass);
      }
      
      public void newsletter()
      {
    	  newsletter.click();
      }
      
      public void policy()
      {
    	  agreebutton.click();
      }
      
      public void contbutton()
      {
    	  continuebutton.click();
      }
      
      public String getmessage()
      {
    	  try
    	  {
    	  return  (confirmmessage.getText());
    	  }
    	  catch (Exception e)
    	  {
    		  return (e.getMessage());
    	  } 
      }
}
