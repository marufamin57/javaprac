package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class step1 {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        System.out.println("456");
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
    }
    @Then("my belly should growl")
    public void my_belly_should_growl() {
//        Assert.fail();
    }
}
