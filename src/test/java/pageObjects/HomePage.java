package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Home']") WebElement lnk_home;
	@FindBy(xpath="//a[normalize-space()='Signup / Login']") WebElement lnk_signup;
	
	
	@FindBy(xpath="//input[@data-qa='login-email']") WebElement txt_loginEmail;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_loginPassword;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login;
	
	
	@FindBy(xpath="//li[10]//a[1]") WebElement lnk_loggedInAs;
	@FindBy(xpath="//a[normalize-space()='Logout']") WebElement lnk_logout;
	@FindBy(xpath="//a[normalize-space()='Delete Account']") WebElement lnk_deleteAccount;
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']") WebElement msg_AccountDeleted;
	
	public boolean ifHomePageVisible()
	{
		try
		{
		   return lnk_home.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void setLoginEmail(String email)
	{
		txt_loginEmail.sendKeys(email);			
	}
	
	public void setLoginPassword(String pswd)
	{
		txt_loginPassword.sendKeys(pswd);;			
	}
	
	public void clickLoginButton()
	{
		btn_login.click();			
	}
	
	public void clickSignup()
	{
		lnk_signup.click();			
	}
	
	public boolean ifLoggedInAsVisible()
	{
		try
		{
		   return lnk_loggedInAs.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}

	}
	
	public void clickLogout()
	{
		lnk_logout.click();			
	}
	
	public void clickDeleteAccount()
	{
		lnk_deleteAccount.click();			
	}
	
	public boolean ifAccountDeletedVisible()
	{
		try
		{
		   return msg_AccountDeleted.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
