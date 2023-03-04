package com.Project.Automation.Exercise;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.BaseClass.baseClass;
import com.automation.PomClass.accountCreatedAndDelete;
import com.automation.PomClass.homePage;
import com.automation.PomClass.registerUser;

public class TC1 extends baseClass
{
	homePage hp;
	registerUser rg;
	accountCreatedAndDelete ac;
	
	@BeforeClass
	public void launch()
	{
//		setup();
		hp = new homePage(driver);
		rg = new registerUser(driver);
		ac = new accountCreatedAndDelete(driver);
	}
	
	@Test(priority = 1)
	public void homepageVerify()
	{
		hp.homePageVisible();
	}
	
	
	@Test(priority = 2)
	public void clicksignup()
	{
		hp.clicksignupButton();
	}

	@Test(priority = 3)
	public void signupVisible()
	{
		rg.verifySignupVisible();
	}
	
	@Test(priority = 4)
	public void signup()
	{
		rg.signup();
	}
	
	@Test(priority = 5)
	public void enterAccountInfo()
	{
		rg.accountInfo();
	}
	
	@Test(priority = 6)
	public void enterAddressInfo()
	{
		rg.addressInfo();
	}
	
	@Test(priority = 7)
	public void clickcreateAccount()
	{
		rg.Creataccount();
	}
	
	@Test(priority = 8)
	public void verifyAccountCreation() throws InterruptedException
	{
		ac.accountCretionText();
	}
	
	@Test(priority = 9)
	public void verifyAccountCreation1() throws InterruptedException
	{
		ac.loggedinasName();		
	}
	
	@Test(priority = 10)
	public void verifyAccountCreation2() throws InterruptedException
	{
		ac.accountDeleted();
		
	}
}
