package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccoutRegi;
import pageObject.HomePage;

public class testCase1 extends BaseClass{

	@Test(priority=1)
	public void verify_account()
	{
		HomePage hp=new HomePage(driver);
		hp.frontend();
		hp.clickaccount();
        hp.clickregi();
        
        
        AccoutRegi acc=new AccoutRegi(driver);
        acc.fristname("basalingappa");
        acc.lastname("basa");
        acc.inputemail("ppabasalinga655@gmail.com");
        acc.inputpass("basalingappa@12345");
        acc.newsletter();
        acc.policy();
        acc.contbutton();

        String confirmmess=acc.getmessage();
        Assert.assertEquals(confirmmess, "'Your Account Has Been Created!");
	}

}
