package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("^login app$")
	public void login_app()  {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		String title=driver.getTitle();
		System.out.println("title");
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
