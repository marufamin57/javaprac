package steps;

import static org.testng.Assert.assertEquals;

import base.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hometest extends base {
	
	@Given("user goes to")
	public void user_goes_to() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    start();
	}
	@When("user lands on")
	public void user_lands_on() {
		
	}
	@Then("title should be")
	public void title_should_be() {
	    assertEquals("Google", browser.getTitle());
	    close();
	}
}
