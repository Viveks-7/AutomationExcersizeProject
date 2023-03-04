package com.automation.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountCreatedAndDelete 
{
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")WebElement accountCreated;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")WebElement continuebtn;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")WebElement deleteaccount;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")WebElement loggedinas;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/h2/b")WebElement accountdeleted;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")WebElement continuebtn1;
	
	
	
	public accountCreatedAndDelete(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void accountCretionText() throws InterruptedException
	{
		continuebtn.click();
		
//		String text = accountCreated.getText();
//		String exptext = "ACCOUNT CREATED!";
//		
//		if(text.equals(exptext))
//		{
//			System.out.println("Account created text is displayed");
//		}
//		else
//		{
//			System.out.println("Account created text is not displayed");
//		}
		
	}
	
	
	public void loggedinasName() throws InterruptedException
	{
//		String text = loggedinas.getText();
//		String exptext = "vivek shinde";
//		
//		if(text.equals(exptext)) 
//		{
//			System.out.println("Username displayed as: "+text);
//		}
//		else
//		{
//			System.out.println("Wrong User");
//		}
		
		
	}
	
	public void accountDeleted()
	{
		deleteaccount.click();
		continuebtn1.click();
//		String text = accountdeleted.getText();
//		String exptext = "ACCOUNT DELETED";
//		
//		if(text.equals(exptext))
//		{
//			System.out.println("Account deleted successfully");
//		}
//		else 
//		{
//			System.out.println("Account not deleted");
//		}
	}
	
	

}
