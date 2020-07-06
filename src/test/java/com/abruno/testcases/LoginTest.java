package com.abruno.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abruno.pages.HomePage;
import com.abruno.pages.LoginPage;
import com.abruno.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data){
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		Assert.fail("Login test failed");
	
		
	}

}
