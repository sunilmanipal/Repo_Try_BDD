package StepDefinition;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^login app$")
	public void login_app()  {
	    // Write code here that turns the phrase above into concrete actions
		Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
		//PhantomJSDriver driver;
		WebDriver driver;
		((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\PhantomJs\\bin\\Phantomjs\\phantomjs.exe");
		 driver = new PhantomJSDriver(caps);
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
