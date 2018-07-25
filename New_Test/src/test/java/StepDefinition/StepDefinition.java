package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	@Given("^login app$")
	public void login_app()  {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Test started");
	}

	@When("^validate$")
	public void validate()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test Executing");
	}

	@Then("^success$")
	public void success()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test Stopping");
	}

}
