package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import stepDefinitions.login;

public class loginPage {	
	public login lp = PageObjectManager.getLandingPage();;

	@Given("Access the application")
	public void access_the_application() {		
	    lp.accessLoginPage();
	}	

	@When("Enter the username as {string} and click next button")
	public void enter_the_username_as_and_click_next_button(String string) throws Exception {
		lp.enterUserName(string);
	}

	@Then("Enter the password as {string} and click submit button")
	public void enter_the_password_as_and_click_submit_button(String string) throws Exception {
		lp.enterPassword(string);
	}

	@Then("Click on the submit button")
	public void click_on_the_submit_button() {
		System.out.println("Click on the submit button");

	}

}
