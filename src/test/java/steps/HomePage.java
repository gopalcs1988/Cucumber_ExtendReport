package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {

	@Then("Check that home page is landed")
	public void check_that_home_page_is_landed() {
		System.out.println("CHeck that home page is landed");
	}
}
