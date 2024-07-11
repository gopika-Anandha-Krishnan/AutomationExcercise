package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC002_DDTLoginTest extends BaseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="DataDriven")//getting data provider from different class
	public void verify_LoginDDT(String email, String pswd,String exp)
	{
		try {
			HomePage hp = new HomePage(driver);
			logger.info("***Verify homepage visible***");
			hp.ifHomePageVisible();
			logger.info("***Click on Signup***");
			hp.clickSignup();
			logger.info("***Enter email and password***");
		    hp.setLoginEmail(email);
		    hp.setLoginPassword(pswd);
		    logger.info("***Verify successful login***");
		    boolean targetpage = hp.ifLoggedInAsVisible();
				
		if(exp.equalsIgnoreCase("valid"))
		{
			if(targetpage==true)
			{
				hp.clickLogout();
				AssertJUnit.assertTrue(true);			
			}
			else
			{
				AssertJUnit.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("invalid"))
		{
			if(targetpage==true)
			{
				hp.clickLogout();
				AssertJUnit.assertTrue(false);			
			}
			else
			{
				AssertJUnit.assertTrue(true);
			}	
		}
		}
		catch(Exception e)
		{
			AssertJUnit.fail();
		}
			
		logger.info("***Finished TC002_DDTLoginTest***");
		
	}

}
