package com.automation.PomClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerUser 
{
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")WebElement UN;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")WebElement Email;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")WebElement signupbtn;
	@FindBy(xpath="//*[@id=\"id_gender1\"]")WebElement titleMr;
	@FindBy(xpath="//*[@id=\"id_gender2\"]")WebElement titleMrs;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement pwd;
	@FindBy(xpath="//*[@id=\"first_name\"]")WebElement firstname;
	@FindBy(xpath="//*[@id=\"last_name\"]")WebElement lastname;
	@FindBy(xpath="//*[@id=\"company\"]")WebElement company;
	@FindBy(xpath="//*[@id=\"address1\"]")WebElement address;
	@FindBy(xpath="//*[@id=\"country\"]")WebElement country;
	@FindBy(xpath="//*[@id=\"state\"]")WebElement state;
	@FindBy(xpath="//input[@id='city']")WebElement city1;
	@FindBy(xpath="//*[@id=\"zipcode\"]")WebElement zipcode;
	@FindBy(xpath="//*[@id=\"mobile_number\"]")WebElement mobileNumber;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")WebElement creatacntbtn;
	@FindBy(xpath="@FindBy(xpath=\"//*[@id=\\\"city\\\"]\")WebElement city;")WebElement day;
	@FindBy(xpath="//*[@id=\"months\"]")WebElement month;
	@FindBy(xpath="//*[@id=\"years\"]")WebElement year;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/h2")WebElement newUserMenuOption;
	@FindBy(xpath="//*[@id=\"newsletter\"]")WebElement newsletter;
	@FindBy(xpath="//*[@id=\"optin\"]")WebElement offers;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/h2/b")WebElement accountinfotext;
	
	
	
	public registerUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySignupVisible()
	{
		if(newUserMenuOption.isDisplayed())
		{
			System.out.println("Signup options are visible");
		}
		else
			System.out.println("signup option are not visible");
	}
	
	public void signup()
	{
		UN.sendKeys("Vivek Shinde");
		Email.sendKeys("vk222@gmail");
		signupbtn.click();
	}

	public void accountInfo()
	{
		String text = accountinfotext.getText();
		String exptext = "Enter Account Information";
				if(text==exptext)
				{
					System.out.println("Account Information Text Displayed Successfully");
				}
				else
				{
					System.out.println("Account Information Text is NOT Displayed.");
				}
		
		titleMr.click();
		pwd.sendKeys("123456789");
		
		Select d = new Select(day);
		d.selectByValue("4");
		
		Select m = new Select(month);
		m.selectByValue("5");
		
		Select y = new Select(year);
		y.selectByValue("1995");
		
		newsletter.click();
		offers.click();
		
	}
	
	public void addressInfo()
	{
		firstname.sendKeys("Vivek");
		lastname.sendKeys("Shinde");
		company.sendKeys("Crif high mark");
		address.sendKeys("Ahmednagar");
		
		Select c = new Select(country);
		c.selectByValue("India");
		
		state.sendKeys("Maharashtra");
		city1.sendKeys("Ahmednagar");
		zipcode.sendKeys("414002");
		mobileNumber.sendKeys("9898989898");
		
	}
	
	public void Creataccount()
	{
		creatacntbtn.click();
	}
	
	
}
