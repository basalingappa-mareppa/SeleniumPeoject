package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyntraHome extends BasaPage{
	Actions action;

	public MyntraHome(WebDriver driver) 
	{
		super(driver);
		
	}
	
	 @FindBy(id="input-firstname") WebElement men;
	 @FindBy(linkText="Sweatshirts") WebElement swet;
	 @FindBy(xpath="//img[@class='img-responsive']") WebElement addswet;
	 //@FindBy(className="pdp-title") WebElement bname;
	 @FindBy(xpath="//div[text()='ADD TO BAG']") WebElement addtocart;
	 @FindBy(xpath="//span[text()='GO TO BAG']") WebElement gotocart;
	 @FindBy(className="size-buttons-size-button") WebElement size;
	 @FindBy(className="size-buttons-size-button") WebElement name;
	 
	 
	 
	 public void menu()
	 {
		 action=new Actions(driver);
		 action.moveToElement(men);
	 }
	 
	 public void swet()
	 {
		 swet.click();
	 }
	 
	 public void addcart()
	 {
		 addswet.click();
	 }
	 
	 public void clickaddtocart()
	 {
		 addtocart.click();
	 }
	 
	 public void gotocart()
	 {
		 gotocart.click();
	 }
}
