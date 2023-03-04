package com.automation.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage 
{
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[1]/div/a/img") WebElement logo;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a") WebElement signupbtn;
//	@FindBy(xpath="") WebElement a;
	

	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homePageVisible()
	{
		if(logo.isDisplayed()==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	
	public void clicksignupButton()
	{
		signupbtn.click();
	}
}
