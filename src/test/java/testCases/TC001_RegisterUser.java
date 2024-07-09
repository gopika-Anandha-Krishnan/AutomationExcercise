package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignUp;
import testBase.BaseClass;

public class TC001_RegisterUser extends BaseClass{
	
	@Test(groups={"Regression","Master"})
	public void verifyUserRegistration()
	{
		logger.info("***Starting***");
		try
		{
			HomePage hp = new HomePage(driver);
			logger.info("***Verify homepage visible***");
			hp.ifHomePageVisible();
			logger.info("***Click on Signup***");
			hp.clickSignup();
			SignUp sp = new SignUp(driver);
			logger.info("***Verify new user signup visible***");
			sp.ifNewUserSignupVisible();
			logger.info("***Enter name and email***");
			sp.setName(randomString());
			sp.setEmailAddress(randomString()+"@gmail.com");
			logger.info("***Click Signup***");
			sp.clickSignup();
			sp.ifEnterAccountInfoVisible();
			logger.info("***Fill user details***");
			sp.setTitle("Mrs");
			sp.setRegisterName(randomString());
			sp.setPassword(randomString());
			sp.setDay("12");
			sp.setMonth("June");
			sp.setYear("1994");
			sp.clickSignupNewsLetter();
			sp.clickReceiveOffer();
			sp.setFirstName(randomString());
			sp.setLastName(randomString());
			sp.setCompany(randomString());
			sp.setAddress1(randomString());
			sp.setCountry("India");
			sp.setState(randomString());
			sp.setCity(randomString());
			sp.setZipcode(randomNumber());
			sp.setMobileNo(randomNumber());
			logger.info("***Verify account creation***");
			sp.clickCreateAccount();
			sp.ifAccountCreatedVisible();
			sp.clickContinue();
			hp.ifLoggedInAsVisible();
			logger.info("***Verify delete account***");
			hp.clickDeleteAccount();
			hp.ifAccountDeletedVisible();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
