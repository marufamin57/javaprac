package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class password {
    @Given("user on login")
    public void user_on_login() {

    }
    @When("user enters following")
    public void user_enters_following(DataTable dataTable) {
        List<List<String>> list=dataTable.asLists();
        for (List<String> e: list) {
            System.out.println(e);
        }
    }
    @Then("user should login")
    public void user_should_login() {

    }
    @When("user enters following {string} and {string}")
    public void user_enters_following_and(String string, String string2) {
        System.out.println(string+string2);
    }


}
