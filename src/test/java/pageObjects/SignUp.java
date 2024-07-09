package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends BasePage{

	public SignUp(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']") WebElement msg_newUserSignup;
	@FindBy(xpath="//input[@placeholder='Name']") WebElement txt_name;
	@FindBy(xpath="//input[@data-qa='signup-email']") WebElement txt_email;
	@FindBy(xpath="//button[normalize-space()='Signup']") WebElement btn_signup;
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']") WebElement msg_enterAccountInfo;
	@FindBy(xpath="//input[@id='id_gender2']") WebElement radio_mrs;
	@FindBy(xpath="//input[@id='id_gender1']") WebElement radio_mr;
	@FindBy(xpath="//input[@id='name']") WebElement txt_rname;
	@FindBy(xpath="//input[@id='email']") WebElement txt_remail;
	@FindBy(xpath="//input[@id='password']") WebElement txt_password;
	@FindBy(xpath="//select[@id='days']") WebElement drpdwn_day;
	@FindBy(xpath="//select[@id='months']") WebElement drpdwn_month;
	@FindBy(xpath="//select[@id='years']") WebElement drpdwn_year;
	@FindBy(xpath="//input[@id='newsletter']") WebElement checkbox_signupNewsltr;
	@FindBy(xpath="//input[@id='optin']") WebElement checkbox_rcveOffers;
	
	@FindBy(xpath="//input[@id='first_name']") WebElement txt_firstName;
	@FindBy(xpath="//input[@id='last_name']") WebElement text_lastName;
	
	@FindBy(xpath="//input[@id='company']") WebElement txt_company;
	@FindBy(xpath="//input[@id='address1']") WebElement txt_address1;
	@FindBy(xpath="//select[@id='country']") WebElement drpdwn_country;
	@FindBy(xpath="//input[@id='state']") WebElement txt_state;
	@FindBy(xpath="//input[@id='city']") WebElement txt_city;
	@FindBy(xpath="//input[@id='zipcode']") WebElement txt_zipcode;
	@FindBy(xpath="//input[@id='mobile_number']") WebElement txt_mobileNo;
	@FindBy(xpath="//button[normalize-space()='Create Account']") WebElement btn_createAccount;

	@FindBy(xpath="//b[normalize-space()='Account Created!']") WebElement msg_accountCreated;
	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement btn_continue;
	
	public boolean ifNewUserSignupVisible()
	{
		try
		{
		   return msg_newUserSignup.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void setName(String name)
	{
		txt_name.sendKeys(name);
	}
	
	public void setEmailAddress(String email)
	{
		txt_email.sendKeys(email);
	}
	public void clickSignup()
	{
		btn_signup.click();	
	}
	public boolean ifEnterAccountInfoVisible()
	{
		try
		{
		   return msg_enterAccountInfo.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void setTitle(String title)
	{
		if(title.equalsIgnoreCase("mr"))
		{
			radio_mr.click();
		}
		else if(title.equalsIgnoreCase("mrs"))
		{
			radio_mrs.click();
		}
			
	}
	
	public void setRegisterName(String name)
	{
		txt_rname.clear();
		txt_rname.sendKeys(name);
	}
	public void setPassword(String pswd)
	{
		txt_password.sendKeys(pswd);
	}
	public void setDay(String day)
	{
		Select objSelect =new Select(drpdwn_day);
		objSelect.selectByVisibleText(day);
	}
	public void setMonth(String month)
	{
		Select objSelect =new Select(drpdwn_month);
		objSelect.selectByVisibleText(month);
	}
	public void setYear(String year)
	{
		Select objSelect =new Select(drpdwn_year);
		objSelect.selectByVisibleText(year);
	}
	public void clickSignupNewsLetter()
	{
		checkbox_signupNewsltr.click();	
	}
	public void clickReceiveOffer()
	{
		checkbox_rcveOffers.click();	
	}
	
	public void setFirstName(String fname)
	{
		txt_firstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		text_lastName.sendKeys(lname);
	}
	public void setCompany(String company)
	{
		txt_company.sendKeys(company);
	}
	public void setAddress1(String add1)
	{
		txt_address1.sendKeys(add1);
	}
	
	public void setCountry(String country)
	{
		Select objSelect =new Select(drpdwn_country);
		objSelect.selectByVisibleText(country);
	}
	public void setState(String state)
	{
		txt_state.sendKeys(state);
	}
	public void setCity(String city)
	{
		txt_city.sendKeys(city);
	}
	public void setZipcode(String zip)
	{
		txt_zipcode.sendKeys(zip);
	}
	public void setMobileNo(String mobile)
	{
		txt_mobileNo.sendKeys(mobile);
	}
	public void clickCreateAccount()
	{
		btn_createAccount.click();	
	}
	public boolean ifAccountCreatedVisible()
	{
		try
		{
		   return msg_accountCreated.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void clickContinue()
	{
		btn_continue.click();	
	}
	
}
