package pageObjects;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import stepDefinitions.login;

public class PageObjectManager {
	
	public static login login;
	
	public static login getLandingPage()
	{
	
	 login= new login();
	 return login;
	}

}
