package stepDefinitions;

import javax.tools.DocumentationTool.Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import core.BrowserInteractions;
import utils.LocatorType;

public class login extends TestBase {

	public void accessLoginPage() {
		Initialization();
		BrowserInteractions.navigateToURL(url);
	}

	public void enterUserName(String string) throws Exception {
		Thread.sleep(2000);
		BrowserInteractions.clearAndType(LocatorType.ID, "username", string);
		BrowserInteractions.click(LocatorType.ID, "continue");
	}

	public void enterPassword(String string) throws Exception {
		Thread.sleep(2000);
		BrowserInteractions.clearAndType(LocatorType.ID, "password", string);
		BrowserInteractions.click(LocatorType.ID, "login");
	}

}
